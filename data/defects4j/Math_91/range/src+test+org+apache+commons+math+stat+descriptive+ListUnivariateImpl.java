{
  "filepath": "/tmp/Math-91b/src/test/org/apache/commons/math/stat/descriptive/ListUnivariateImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ListUnivariateImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.DescriptiveStatistics",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 216,
      "comment": "\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Holds a reference to a list - GENERICs are going to make\n     * our lives easier here as we could only accept List\u003cNumber\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Number Transformer maps Objects to Number for us. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * No argument Constructor\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl(java.util.List\u003cjava.lang.Object\u003e)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Construct a ListUnivariate with a specific List.\n     * @param list The list that will back this DescriptiveStatistics\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl(java.util.List\u003cjava.lang.Object\u003e, org.apache.commons.math.util.NumberTransformer)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Construct a ListUnivariate with a specific List.\n     * @param list The list that will back this DescriptiveStatistics\n     * @param transformer the number transformer used to convert the list items.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 16)",
        "(line 68,col 9)-(line 68,col 25)",
        "(line 69,col 9)-(line 69,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getValues()",
      "begin_line": 75,
      "end_line": 97,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getValues()\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 33)",
        "(line 84,col 9)-(line 88,col 9)",
        "(line 91,col 9)-(line 91,col 50)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getElement(int)",
      "begin_line": 102,
      "end_line": 122,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getElement(int)\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 34)",
        "(line 106,col 9)-(line 106,col 30)",
        "(line 108,col 9)-(line 112,col 9)",
        "(line 115,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 121,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getN()",
      "begin_line": 127,
      "end_line": 140,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getN()\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 18)",
        "(line 130,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.addValue(double)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#addValue(double)\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.addObject(java.lang.Object)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Adds an object to this list. \n     * @param o Object to add to the list\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.clear()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Clears all statistics.\n     * \u003cp\u003e\n     * \u003cstrong\u003eN.B.: \u003c/strong\u003e This method has the side effect of clearing the underlying list.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 171,
      "end_line": 178,
      "comment": "\n     * Apply the given statistic to this univariate collection.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 38)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getTransformer()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Access the number transformer.\n     * @return the number transformer.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.setTransformer(org.apache.commons.math.util.NumberTransformer)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Modify the number transformer.\n     * @param transformer the new number transformer.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.setWindowSize(int)",
      "begin_line": 199,
      "end_line": 207,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#setWindowSize(int)\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 37)",
        "(line 203,col 9)-(line 203,col 45)",
        "(line 204,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getWindowSize()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getWindowSize\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 26)"
      ]
    }
  ]
}