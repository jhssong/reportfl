{
  "filepath": "/tmp/Math-106b/src/test/org/apache/commons/math/stat/descriptive/ListUnivariateImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ListUnivariateImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.DescriptiveStatistics",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 218,
      "comment": "\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Holds a reference to a list - GENERICs are going to make\n     * out lives easier here as we could only accept List\u003cNumber\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Number Transformer maps Objects to Number for us. "
    },
    {
      "type": "field",
      "varNames": [
        "windowSize"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " hold the window size *"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * No argument Constructor\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl(java.util.List)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Construct a ListUnivariate with a specific List.\n     * @param list The list that will back this DescriptiveStatistics\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl(java.util.List, org.apache.commons.math.util.NumberTransformer)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Construct a ListUnivariate with a specific List.\n     * @param list The list that will back this DescriptiveStatistics\n     * @param transformer the number transformer used to convert the list items.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 16)",
        "(line 70,col 9)-(line 70,col 25)",
        "(line 71,col 9)-(line 71,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getValues()",
      "begin_line": 77,
      "end_line": 99,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getValues()\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 33)",
        "(line 86,col 9)-(line 90,col 9)",
        "(line 93,col 9)-(line 93,col 50)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getElement(int)",
      "begin_line": 104,
      "end_line": 124,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getElement(int)\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 34)",
        "(line 108,col 9)-(line 108,col 30)",
        "(line 110,col 9)-(line 114,col 9)",
        "(line 117,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getN()",
      "begin_line": 129,
      "end_line": 142,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getN()\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 18)",
        "(line 132,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.addValue(double)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#addValue(double)\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.addObject(java.lang.Object)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Adds an object to this list. \n     * @param o Object to add to the list\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.clear()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Clears all statistics.\n     * \u003cp\u003e\n     * \u003cstrong\u003eN.B.: \u003c/strong\u003e This method has the side effect of clearing the underlying list.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 173,
      "end_line": 180,
      "comment": "\n     * Apply the given statistic to this univariate collection.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 38)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getTransformer()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Access the number transformer.\n     * @return the number transformer.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.setTransformer(org.apache.commons.math.util.NumberTransformer)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Modify the number transformer.\n     * @param transformer the new number transformer.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.setWindowSize(int)",
      "begin_line": 201,
      "end_line": 209,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#setWindowSize(int)\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 37)",
        "(line 205,col 9)-(line 205,col 45)",
        "(line 206,col 9)-(line 208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getWindowSize()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getWindowSize\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 26)"
      ]
    }
  ]
}