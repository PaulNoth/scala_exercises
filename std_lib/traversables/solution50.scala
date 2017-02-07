// You would choose *foldLeft/reduceLeft* or *foldRight/reduceRight* based on your mathematical goal.
// One other reason for deciding is performance. foldLeft is more performant since it uses
// tail recursion and is optimized. This exercise will either work or you will receive a *StackOverflowError*.

val MAX_SIZE = 1000000
val reduceLeftStartTime = new java.util.Date
(1 to MAX_SIZE) reduceLeft (_ + _)
val reduceLeftEndTime = new java.util.Date

val reduceRightStartTime = new java.util.Date
(1 to MAX_SIZE) reduceRight (_ + _)
val reduceRightEndTime = new java.util.Date

val totalReduceLeftTime = reduceLeftEndTime.getTime - reduceLeftStartTime.getTime
val totalReduceRightTime = reduceRightEndTime.getTime - reduceRightStartTime.getTime

(totalReduceRightTime > totalReduceLeftTime) should be(true)