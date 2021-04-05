//顶层模块
module ALU(A,B,ALUctr,Zero,Overflow,Reslut)
input [31;0] A,B;
input [2;0] ALUctr;
output [31;0] Reslut;
output Zero,Overflow;

wire SUBctr,OVctr,SIGctr;
wire [1;0]OPctr;//这里是符号解析模块

ALUctr_split ALUctr_split1(ALUctr,SUBctr,OPctr,OVctr,SIGctr)//符号解析
adder(A,B,SUBctr,AddCarry,AddOverflow,AddSign,AddResult,AddZore);//综合加法模块
assign Overflow = AddOverflow &OVctr;//是否判断溢出
assign Zero = AddZore;

wire less;
assign less = (SIGctr == 1)?(AddSign ^ AddOverflow): (SUBctr^AddCarry);
wire mux4to1_02;//四选一信号选择器的02号线输入
wire mux4to1_01;
assign mux4to1_01 = A | B;
mux2to1_32bit mux2to1_32bit_01(32{0}, 32{1}, less,mux4to1_02 );
mux4to1_32bit mux4to1_32bit_01(AddResult,mux4to1_01,mux4to1_02,OPctr,Reslut);
endmodule

//ALUctr解析模块
module ALUctr_split(ALUctr,SUBctr,OPctr,OVctr,SIGctr)
input [2;0] ALUctr;
output SUBctr,OVctr,SIGctr;
output [1;0] OPctr;
assign SUBctr = ALUctr[2];
assign OVctr = !ALUctr[1]&ALUctr[0];
assign SIGctr = ALUctr[0];
assign OPctr[1] = ALUctr[2]&ALUctr[1];
assign OPctr[0] = !ALUctr[2]ALUctr[1] & !ALUctr[0];
endmodule



//32位二选一数据选择器模块,
module mux2to1_32bit (V, W, Selm, F);
  parameter k = 31;
  input [k−1:0] V, W;
  input Selm;
  output [k−1:0] F;
  reg [k−1:0] F;
  always @(V or W or Selm)
  if (Selm == 0) F = V;
  else F = W;
endmodule

//32位三选一数据选择器模块
module mux4to1_32bit(AddResult,mux4to1_01,mux4to1_02,OPctr,Reslut)
  parameter k = 31;
  input [k−1:0] mux4to1_01, mux4to1_02;
  input [1;0] OPctr;
  output [k−1:0] Reslut;
  reg [k−1:0] Reslut;
  always @(AddResult or mux4to1_01 or mux4to1_02 or OPctr)
  if (OPctr == 2'b00) Reslut = AddResult;
  else if (OPctr == 2'b01) Reslut = mux4to1_01;
  else if (OPctr = 2'b10) Reslut = mux4to1_02; 
endmodule

//32位全加器
module adder_32_bit(A,B,Cin,Reslut,cout)
input [31;0] A,B;
input cin;
output [31;0]Reslut;
output cout;
assign {cout,Reslut} = {A+B+Cin};
endmodule


//加法模块
module adder(A,B,SUBctr,AddCarry,AddOverflow,AddSign,AddResult,AddZore)
input [31;0] A,B;
input SUBctr;
output AddCarry,AddOverflow,AddSign,AddZore; 
output [31;0]AddResult;
wire cout;
wire [31;0]  adder_B;//输入加法器的数
wire [31;0] temp;//符号操作拓展阵列，用于取反
assign temp = {32{SUBctr}};
assign adder_B = temp ^ B; 
adder_32_bit adder_32_bit_01(A,adder_B,SUBctr,AddResult,cout);
assign  AddCarry = cout ^ SUBctr;
assign  AddOverflow = (A[31]&B[31]&(!AddResult[31]))|((A[31])&(B[31])&AddResult[31]);
assign  AddSign = AddResult[31];
assign  AddZore = (AddResult == 0)?1:0;
endmodule