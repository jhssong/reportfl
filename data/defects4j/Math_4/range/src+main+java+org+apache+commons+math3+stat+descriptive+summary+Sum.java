{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/summary/Sum.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Sum",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 227,
      "comment": "\n  * Returns the sum of the available values.\n * \u003cp\u003e\n * If there are no values in the dataset, then 0 is returned.\n * If any of the values are\n * \u003ccode\u003eNaN\u003c/code\u003e, then \u003ccode\u003eNaN\u003c/code\u003e is returned.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * The currently running sum.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Sum.Sum()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Create a Sum instance\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 14)",
        "(line 59,col 9)-(line 59,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Sum.Sum(org.apache.commons.math3.stat.descriptive.summary.Sum)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Copy constructor, creates a new {@code Sum} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Sum} instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Sum.increment(double)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 19)",
        "(line 79,col 9)-(line 79,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Sum.getResult()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Sum.getN()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Sum.clear()",
      "begin_line": 100,
      "end_line": 104,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 18)",
        "(line 103,col 9)-(line 103,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Sum.evaluate(double[], int, int)",
      "begin_line": 120,
      "end_line": 131,
      "comment": "\n     * The sum of the entries in the specified portion of\n     * the input array, or 0 if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the values or 0 if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 32)",
        "(line 124,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Sum.evaluate(double[], double[], int, int)",
      "begin_line": 160,
      "end_line": 170,
      "comment": "\n     * The weighted sum of the entries in the specified portion of\n     * the input array, or 0 if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Uses the formula, \u003cpre\u003e\n     *    weighted sum \u003d \u0026Sigma;(values[i] * weights[i])\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the values or 0 if length \u003d 0\n     * @throws MathIllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 32)",
        "(line 163,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Sum.evaluate(double[], double[])",
      "begin_line": 194,
      "end_line": 197,
      "comment": "\n     * The weighted sum of the entries in the the input array.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Uses the formula, \u003cpre\u003e\n     *    weighted sum \u003d \u0026Sigma;(values[i] * weights[i])\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @return the sum of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Sum.copy()",
      "begin_line": 202,
      "end_line": 208,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 31)",
        "(line 206,col 9)-(line 206,col 27)",
        "(line 207,col 9)-(line 207,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Sum.copy(org.apache.commons.math3.stat.descriptive.summary.Sum, org.apache.commons.math3.stat.descriptive.summary.Sum)",
      "begin_line": 218,
      "end_line": 225,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Sum to copy\n     * @param dest Sum to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 39)",
        "(line 221,col 9)-(line 221,col 37)",
        "(line 222,col 9)-(line 222,col 42)",
        "(line 223,col 9)-(line 223,col 26)",
        "(line 224,col 9)-(line 224,col 34)"
      ]
    }
  ]
}