{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/genetics/PermutationChromosome.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PermutationChromosome",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 44,
      "comment": "\n * Interface indicating that the chromosome represents a permutation of objects.\n *\n * @param \u003cT\u003e\n *            type of the permuted objects\n * @since 2.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.PermutationChromosome.decode(java.util.List\u003cT\u003e)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Permutes the \u003ccode\u003esequence\u003c/code\u003e of objects of type T according to the\n     * permutation this chromosome represents. For example, if this chromosome\n     * represents a permutation (3,0,1,2), and the unpermuted sequence is\n     * (a,b,c,d), this yields (d,a,b,c).\n     *\n     * @param sequence\n     *            the unpermuted (original) sequence of objects\n     * @return permutation of \u003ccode\u003esequence\u003c/code\u003e represented by this\n     *         permutation\n     ",
      "child_ranges": []
    }
  ]
}