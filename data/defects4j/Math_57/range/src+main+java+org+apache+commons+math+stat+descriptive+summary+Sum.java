{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/stat/descriptive/summary/Sum.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Sum",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 217,
      "comment": "\n  * Returns the sum of the available values.\n * \u003cp\u003e\n * If there are no values in the dataset, then 0 is returned.\n * If any of the values are\n * \u003ccode\u003eNaN\u003c/code\u003e, then \u003ccode\u003eNaN\u003c/code\u003e is returned.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * The currently running sum.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Sum.Sum()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Create a Sum instance\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 14)",
        "(line 56,col 9)-(line 56,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Sum.Sum(org.apache.commons.math.stat.descriptive.summary.Sum)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Copy constructor, creates a new {@code Sum} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Sum} instance to copy\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Sum.increment(double)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 19)",
        "(line 75,col 9)-(line 75,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Sum.getResult()",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Sum.getN()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Sum.clear()",
      "begin_line": 96,
      "end_line": 100,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 18)",
        "(line 99,col 9)-(line 99,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Sum.evaluate(double[], int, int)",
      "begin_line": 116,
      "end_line": 126,
      "comment": "\n     * The sum of the entries in the specified portion of\n     * the input array, or 0 if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the values or 0 if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 32)",
        "(line 119,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Sum.evaluate(double[], double[], int, int)",
      "begin_line": 155,
      "end_line": 165,
      "comment": "\n     * The weighted sum of the entries in the specified portion of\n     * the input array, or 0 if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Uses the formula, \u003cpre\u003e\n     *    weighted sum \u003d \u0026Sigma;(values[i] * weights[i])\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the values or 0 if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 32)",
        "(line 158,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Sum.evaluate(double[], double[])",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * The weighted sum of the entries in the the input array.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Uses the formula, \u003cpre\u003e\n     *    weighted sum \u003d \u0026Sigma;(values[i] * weights[i])\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @return the sum of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Sum.copy()",
      "begin_line": 196,
      "end_line": 201,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 31)",
        "(line 199,col 9)-(line 199,col 27)",
        "(line 200,col 9)-(line 200,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Sum.copy(org.apache.commons.math.stat.descriptive.summary.Sum, org.apache.commons.math.stat.descriptive.summary.Sum)",
      "begin_line": 211,
      "end_line": 215,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Sum to copy\n     * @param dest Sum to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 42)",
        "(line 213,col 9)-(line 213,col 26)",
        "(line 214,col 9)-(line 214,col 34)"
      ]
    }
  ]
}