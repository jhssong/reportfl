{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/descriptive/summary/Product.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Product",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable",
        "org.apache.commons.math.stat.descriptive.WeightedEvaluation"
      ],
      "begin_line": 37,
      "end_line": 222,
      "comment": "\n * Returns the product of the available values.\n * \u003cp\u003e\n * If there are no values in the dataset, or any of the values are\n * \u003ccode\u003eNaN\u003c/code\u003e, then \u003ccode\u003eNaN\u003c/code\u003e is returned.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
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
      "comment": "The number of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * The current Running Product.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.Product()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Create a Product instance\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 14)",
        "(line 55,col 9)-(line 55,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.Product(org.apache.commons.math.stat.descriptive.summary.Product)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Copy constructor, creates a new {@code Product} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Product} instance to copy\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.increment(double)",
      "begin_line": 71,
      "end_line": 79,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.getResult()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.getN()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.clear()",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 27)",
        "(line 102,col 9)-(line 102,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.evaluate(double[], int, int)",
      "begin_line": 119,
      "end_line": 129,
      "comment": "\n     * Returns the product of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the product of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 36)",
        "(line 122,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.evaluate(double[], double[], int, int)",
      "begin_line": 159,
      "end_line": 169,
      "comment": "\n     * \u003cp\u003eReturns the weighted product of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\u003c/p\u003e\n     *\n     * \u003cp\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eUses the formula, \u003cpre\u003e\n     *    weighted product \u003d \u0026prod;values[i]\u003csup\u003eweights[i]\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * that is, the weights are applied as exponents when computing the weighted product.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the product of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 36)",
        "(line 162,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.evaluate(double[], double[])",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eReturns the weighted product of the entries in the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eUses the formula, \u003cpre\u003e\n     *    weighted product \u003d \u0026prod;values[i]\u003csup\u003eweights[i]\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * that is, the weights are applied as exponents when computing the weighted product.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @return the product of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.copy()",
      "begin_line": 202,
      "end_line": 207,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 39)",
        "(line 205,col 9)-(line 205,col 27)",
        "(line 206,col 9)-(line 206,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.copy(org.apache.commons.math.stat.descriptive.summary.Product, org.apache.commons.math.stat.descriptive.summary.Product)",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Product to copy\n     * @param dest Product to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 26)",
        "(line 219,col 9)-(line 219,col 34)"
      ]
    }
  ]
}