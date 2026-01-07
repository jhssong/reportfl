{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/summary/Product.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Product",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable",
        "org.apache.commons.math3.stat.descriptive.WeightedEvaluation"
      ],
      "begin_line": 42,
      "end_line": 231,
      "comment": "\n * Returns the product of the available values.\n * \u003cp\u003e\n * If there are no values in the dataset, then 1 is returned.\n *  If any of the values are\n * \u003ccode\u003eNaN\u003c/code\u003e, then \u003ccode\u003eNaN\u003c/code\u003e is returned.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "The number of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * The current Running Product.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Product.Product()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Create a Product instance\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 14)",
        "(line 60,col 9)-(line 60,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Product.Product(org.apache.commons.math3.stat.descriptive.summary.Product)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Copy constructor, creates a new {@code Product} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Product} instance to copy\n     * @throws NullArgumentException  if original is null\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Product.increment(double)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 19)",
        "(line 80,col 9)-(line 80,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Product.getResult()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Product.getN()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Product.clear()",
      "begin_line": 101,
      "end_line": 105,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 18)",
        "(line 104,col 9)-(line 104,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Product.evaluate(double[], int, int)",
      "begin_line": 121,
      "end_line": 132,
      "comment": "\n     * Returns the product of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the product of the values or 1 if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 36)",
        "(line 125,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Product.evaluate(double[], double[], int, int)",
      "begin_line": 162,
      "end_line": 172,
      "comment": "\n     * \u003cp\u003eReturns the weighted product of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\u003c/p\u003e\n     *\n     * \u003cp\u003eThrows \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eUses the formula, \u003cpre\u003e\n     *    weighted product \u003d \u0026prod;values[i]\u003csup\u003eweights[i]\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * that is, the weights are applied as exponents when computing the weighted product.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the product of the values or 1 if length \u003d 0\n     * @throws MathIllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 36)",
        "(line 165,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Product.evaluate(double[], double[])",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n     * \u003cp\u003eReturns the weighted product of the entries in the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThrows \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eUses the formula, \u003cpre\u003e\n     *    weighted product \u003d \u0026prod;values[i]\u003csup\u003eweights[i]\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * that is, the weights are applied as exponents when computing the weighted product.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @return the product of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Product.copy()",
      "begin_line": 206,
      "end_line": 212,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 39)",
        "(line 210,col 9)-(line 210,col 27)",
        "(line 211,col 9)-(line 211,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.Product.copy(org.apache.commons.math3.stat.descriptive.summary.Product, org.apache.commons.math3.stat.descriptive.summary.Product)",
      "begin_line": 222,
      "end_line": 229,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Product to copy\n     * @param dest Product to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 39)",
        "(line 225,col 9)-(line 225,col 37)",
        "(line 226,col 9)-(line 226,col 42)",
        "(line 227,col 9)-(line 227,col 26)",
        "(line 228,col 9)-(line 228,col 34)"
      ]
    }
  ]
}