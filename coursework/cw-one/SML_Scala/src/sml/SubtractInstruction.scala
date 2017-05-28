package sml

/**
  * Created by Sonny on 28/05/2017.
  */

class SubtractInstruction(label: String, op: String, var result: Int, val op1: Int, val op2: Int)
  extends Instruction(label, op) {

  override def execute(m: Machine) {
    val value1 : Int = m.regs(op1)
    val value2 : Int = m.regs(op2)
    result = value1 .-(value2)
    m.regs(result) = result
  }

  override def toString(): String = {
    super.toString + " register" + op1 + " - register" + op2 + " to register " + result + "\n"
  }
}

object SubtractInstruction {
  def apply(label: String, result: Int, op1: Int, op2: Int) =
    new SubtractInstruction(label, "sub", result, op1, op2)
}