{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/summary/SumOfSquares.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SumOfSquares",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 160,
      "comment": "\n * Returns the sum of the squares of the available values.\n * \u003cp\u003e\n * If there are no values in the dataset, then 0 is returned.\n * If any of the values are\n * \u003ccode\u003eNaN\u003c/code\u003e, then \u003ccode\u003eNaN\u003c/code\u003e is returned.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * The currently running sumSq\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfSquares.SumOfSquares()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Create a SumOfSquares instance\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 14)",
        "(line 58,col 9)-(line 58,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfSquares.SumOfSquares(org.apache.commons.math3.stat.descriptive.summary.SumOfSquares)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Copy constructor, creates a new {@code SumOfSquares} identical\n     * to the {@code original}\n     *\n     * @param original the {@code SumOfSquares} instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfSquares.increment(double)",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 23)",
        "(line 78,col 9)-(line 78,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfSquares.getResult()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfSquares.getN()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfSquares.clear()",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 18)",
        "(line 102,col 9)-(line 102,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfSquares.evaluate(double[], int, int)",
      "begin_line": 119,
      "end_line": 130,
      "comment": "\n     * Returns the sum of the squares of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the squares of the values or 0 if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 34)",
        "(line 123,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfSquares.copy()",
      "begin_line": 135,
      "end_line": 141,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 49)",
        "(line 139,col 9)-(line 139,col 27)",
        "(line 140,col 9)-(line 140,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfSquares.copy(org.apache.commons.math3.stat.descriptive.summary.SumOfSquares, org.apache.commons.math3.stat.descriptive.summary.SumOfSquares)",
      "begin_line": 151,
      "end_line": 158,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SumOfSquares to copy\n     * @param dest SumOfSquares to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 39)",
        "(line 154,col 9)-(line 154,col 37)",
        "(line 155,col 9)-(line 155,col 42)",
        "(line 156,col 9)-(line 156,col 26)",
        "(line 157,col 9)-(line 157,col 34)"
      ]
    }
  ]
}