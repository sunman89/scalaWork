package sml

/**
  * Created by Sonny on 28/05/2017.
  */

class DivideInstruction(label: String, op: String, val result: Int, val op1: Int, val op2: Int)
  extends Instruction(label, op) {

  override def execute(m: Machine) {
    val value1 = m.regs(op1)
    val value2 = m.regs(op2)
    m.regs(result) = value1./(value2)
  }

  override def toString(): String = {
    super.toString + " register" + op1 + " / register" + op2 + " to register " + result + "\n"
  }
}

object DivideInstruction {
  def apply(label: String, result: Int, op1: Int, op2: Int) =
    new DivideInstruction(label, "div", result, op1, op2)
}