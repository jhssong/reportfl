{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/stat/descriptive/rank/Max.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Max",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic"
      ],
      "begin_line": 38,
      "end_line": 155,
      "comment": "\n * Returns the maximum of the available values.\n * \u003cp\u003e\n * \u003cul\u003e\n * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e \n * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e, \n * the result is \u003ccode\u003eDouble.POSITIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n* \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
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
      "comment": " Number of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Current value of the statistic "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Max.Max()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Create a Max instance\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 14)",
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Max.Max(org.apache.commons.math.stat.descriptive.rank.Max)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Copy constructor, creates a new {@code Max} identical\n     * to the {@code original}\n     * \n     * @param original the {@code Max} instance to copy\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Max.increment(double)",
      "begin_line": 70,
      "end_line": 75,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Max.clear()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 27)",
        "(line 82,col 9)-(line 82,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Max.getResult()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Max.getN()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Max.evaluate(double[], int, int)",
      "begin_line": 121,
      "end_line": 132,
      "comment": "\n     * Returns the maximum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * the array index parameters are not valid.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e \n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e, \n     * the result is \u003ccode\u003eDouble.POSITIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the maximum of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 32)",
        "(line 123,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Max.copy()",
      "begin_line": 137,
      "end_line": 141,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 31)",
        "(line 139,col 9)-(line 139,col 27)",
        "(line 140,col 9)-(line 140,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Max.copy(org.apache.commons.math.stat.descriptive.rank.Max, org.apache.commons.math.stat.descriptive.rank.Max)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \n     * @param source Max to copy\n     * @param dest Max to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 26)",
        "(line 153,col 9)-(line 153,col 34)"
      ]
    }
  ]
}