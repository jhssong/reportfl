{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/rank/Median.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Median",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.rank.Percentile",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 59,
      "comment": "\n * Returns the median of the available values.  This is the same as the 50th percentile.\n * See {@link Percentile} for a description of the algorithm used.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Median.Median()",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Median.Median(org.apache.commons.math3.stat.descriptive.rank.Median)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Copy constructor, creates a new {@code Median} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Median} instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 24)"
      ]
    }
  ]
}