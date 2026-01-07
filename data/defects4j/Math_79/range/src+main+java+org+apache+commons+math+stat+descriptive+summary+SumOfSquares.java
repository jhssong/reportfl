{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/descriptive/summary/SumOfSquares.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SumOfSquares",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 153,
      "comment": "\n * Returns the sum of the squares of the available values.\n * \u003cp\u003e\n * If there are no values in the dataset, or any of the values are\n * \u003ccode\u003eNaN\u003c/code\u003e, then \u003ccode\u003eNaN\u003c/code\u003e is returned.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * The currently running sumSq\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.SumOfSquares()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Create a SumOfSquares instance\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 14)",
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.SumOfSquares(org.apache.commons.math.stat.descriptive.summary.SumOfSquares)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Copy constructor, creates a new {@code SumOfSquares} identical\n     * to the {@code original}\n     *\n     * @param original the {@code SumOfSquares} instance to copy\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.increment(double)",
      "begin_line": 70,
      "end_line": 78,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.getResult()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.getN()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.clear()",
      "begin_line": 98,
      "end_line": 102,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 27)",
        "(line 101,col 9)-(line 101,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.evaluate(double[], int, int)",
      "begin_line": 118,
      "end_line": 128,
      "comment": "\n     * Returns the sum of the squares of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the squares of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 34)",
        "(line 121,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.copy()",
      "begin_line": 133,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 49)",
        "(line 136,col 9)-(line 136,col 27)",
        "(line 137,col 9)-(line 137,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfSquares.copy(org.apache.commons.math.stat.descriptive.summary.SumOfSquares, org.apache.commons.math.stat.descriptive.summary.SumOfSquares)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SumOfSquares to copy\n     * @param dest SumOfSquares to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 26)",
        "(line 150,col 9)-(line 150,col 34)"
      ]
    }
  ]
}