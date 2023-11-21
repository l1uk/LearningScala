package BinaryTree

abstract class IntSet {
  def add(x: Int): IntSet

  def contains(x: Int): Boolean

  def union(other: IntSet): IntSet

  def remove(x: Int): IntSet

  def intersec(other: IntSet): IntSet

  def max(): IntSet

  def getValue: Int
}
