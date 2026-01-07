{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/descriptive/summary/Product.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Product",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 192,
      "comment": "\n * Returns the product of the available values.\n * \u003cp\u003e\n * If there are no values in the dataset, or any of the values are\n * \u003ccode\u003eNaN\u003c/code\u003e, then \u003ccode\u003eNaN\u003c/code\u003e is returned.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
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
      "comment": "The number of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * The current Running Product.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.Product()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Create a Product instance\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 14)",
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.Product(org.apache.commons.math.stat.descriptive.summary.Product)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Copy constructor, creates a new {@code Product} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Product} instance to copy\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.increment(double)",
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
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.getResult()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.getN()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.clear()",
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
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.evaluate(double[], int, int)",
      "begin_line": 118,
      "end_line": 128,
      "comment": "\n     * Returns the product of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the product of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 36)",
        "(line 121,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.evaluate(double[], double[], int, int)",
      "begin_line": 157,
      "end_line": 167,
      "comment": "\n     * \u003cp\u003eReturns the weighted product of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\u003c/p\u003e\n     *\n     * \u003cp\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eUses the formula, \u003cpre\u003e\n     *    weighted product \u003d \u0026prod;values[i]\u003csup\u003eweights[i]\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * that is, the weights are applied as exponents when computing the weighted product.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the product of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 36)",
        "(line 160,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.copy()",
      "begin_line": 172,
      "end_line": 177,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 39)",
        "(line 175,col 9)-(line 175,col 27)",
        "(line 176,col 9)-(line 176,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.Product.copy(org.apache.commons.math.stat.descriptive.summary.Product, org.apache.commons.math.stat.descriptive.summary.Product)",
      "begin_line": 187,
      "end_line": 190,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Product to copy\n     * @param dest Product to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 26)",
        "(line 189,col 9)-(line 189,col 34)"
      ]
    }
  ]
}