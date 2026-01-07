{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/PermutationChromosome.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PermutationChromosome",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 41,
      "comment": "\n * Interface indicating that the chromosome represents a permutation of objects.\n *\n * @param \u003cT\u003e type of the permuted objects\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.PermutationChromosome.decode(java.util.List\u003cT\u003e)",
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Permutes the \u003ccode\u003esequence\u003c/code\u003e of objects of type T according to the\n     * permutation this chromosome represents. For example, if this chromosome\n     * represents a permutation (3,0,1,2), and the unpermuted sequence is\n     * (a,b,c,d), this yields (d,a,b,c).\n     *\n     * @param sequence the unpermuted (original) sequence of objects\n     * @return permutation of \u003ccode\u003esequence\u003c/code\u003e represented by this permutation\n     ",
      "child_ranges": []
    }
  ]
}