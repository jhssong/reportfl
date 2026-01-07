{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/stat/descriptive/summary/SumOfSquares.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SumOfSquares",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 151,
      "comment": "\n * Returns the sum of the squares of the available values.\n * \u003cp\u003e\n * If there are no values in the dataset, then 0 is returned.\n * If any of the values are\n * \u003ccode\u003eNaN\u003c/code\u003e, then \u003ccode\u003eNaN\u003c/code\u003e is returned.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * The currently running sumSq\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.SumOfSquares()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Create a SumOfSquares instance\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 14)",
        "(line 55,col 9)-(line 55,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.SumOfSquares(org.apache.commons.math.stat.descriptive.summary.SumOfSquares)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Copy constructor, creates a new {@code SumOfSquares} identical\n     * to the {@code original}\n     *\n     * @param original the {@code SumOfSquares} instance to copy\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.increment(double)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 23)",
        "(line 74,col 9)-(line 74,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.getResult()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.getN()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.clear()",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 18)",
        "(line 98,col 9)-(line 98,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.evaluate(double[], int, int)",
      "begin_line": 115,
      "end_line": 125,
      "comment": "\n     * Returns the sum of the squares of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the squares of the values or 0 if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 34)",
        "(line 118,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.copy()",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 49)",
        "(line 133,col 9)-(line 133,col 27)",
        "(line 134,col 9)-(line 134,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.copy(org.apache.commons.math.stat.descriptive.summary.SumOfSquares, org.apache.commons.math.stat.descriptive.summary.SumOfSquares)",
      "begin_line": 145,
      "end_line": 149,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SumOfSquares to copy\n     * @param dest SumOfSquares to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 42)",
        "(line 147,col 9)-(line 147,col 26)",
        "(line 148,col 9)-(line 148,col 34)"
      ]
    }
  ]
}