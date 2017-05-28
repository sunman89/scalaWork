package sml

/**
  * Created by Sonny on 28/05/2017.
  */

class OutputInstruction(label: String, op : String, val register : Int)
  extends Instruction(label, op) {

  override def execute(m: Machine) {println(m.regs(register))}

  override def toString(): String = {
    super.toString + " output at label " + label + " at register " + register + "\n"
  }
}

object OutputInstruction {
  def apply(label: String, register : Int) =
    new OutputInstruction(label, "out", register)
}