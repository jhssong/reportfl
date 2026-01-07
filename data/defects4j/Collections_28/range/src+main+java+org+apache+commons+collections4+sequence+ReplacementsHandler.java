{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/sequence/ReplacementsHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReplacementsHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 52,
      "comment": "\n * This interface is devoted to handle synchronized replacement sequences.\n *\n * @see ReplacementsFinder\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.ReplacementsHandler.handleReplacement(int, java.util.List\u003cT\u003e, java.util.List\u003cT\u003e)",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Handle two synchronized sequences.\n     * \u003cp\u003e\n     * This method is called by a {@link ReplacementsFinder ReplacementsFinder}\n     * instance when it has synchronized two sub-sequences of object arrays\n     * being compared, and at least one of the sequences is non-empty. Since the\n     * sequences are synchronized, the objects before the two sub-sequences are\n     * equals (if they exist). This property also holds for the objects after\n     * the two sub-sequences.\n     * \u003cp\u003e\n     * The replacement is defined as replacing the \u003ccode\u003efrom\u003c/code\u003e\n     * sub-sequence into the \u003ccode\u003eto\u003c/code\u003e sub-sequence.\n     *\n     * @param skipped  number of tokens skipped since the last call (i.e. number of\n     *   tokens that were in both sequences), this number should be strictly positive\n     *   except on the very first call where it can be zero (if the first object of\n     *   the two sequences are different)\n     * @param from  sub-sequence of objects coming from the first sequence\n     * @param to  sub-sequence of objects coming from the second sequence\n     ",
      "child_ranges": []
    }
  ]
}