package sml

/**
  * Created by Sonny on 28/05/2017.
  */

class BnzInstruction(label: String, op: String, val result: Int, val nextOne: String)
  extends Instruction(label, op) {

  override def execute(m: Machine) {
    val bnz = m.regs(result)
    if(bnz != 0) {
      m.pc = m.labels.labels.indexOf(nextOne)
    }
  }

  override def toString(): String = {
    super.toString + " register =  " + result + ",  instruction is now " + nextOne + "\n"
  }
}

object BnzInstruction {
  def apply(label: String, result: Int, nextOne: String) =
    new BnzInstruction(label, "bnz", result, nextOne)
}