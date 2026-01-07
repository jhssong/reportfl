{
  "filepath": "/tmp/Math-104b/src/test/org/apache/commons/math/stat/descriptive/ListUnivariateImpl.java",
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
      "end_line": 219,
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
      "comment": "\n     * Holds a reference to a list - GENERICs are going to make\n     * out lives easier here as we could only accept List\u003cNumber\u003e\n     "
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
      "type": "field",
      "varNames": [
        "windowSize"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " hold the window size *"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * No argument Constructor\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl(java.util.List)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Construct a ListUnivariate with a specific List.\n     * @param list The list that will back this DescriptiveStatistics\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl(java.util.List, org.apache.commons.math.util.NumberTransformer)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n     * Construct a ListUnivariate with a specific List.\n     * @param list The list that will back this DescriptiveStatistics\n     * @param transformer the number transformer used to convert the list items.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 16)",
        "(line 71,col 9)-(line 71,col 25)",
        "(line 72,col 9)-(line 72,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getValues()",
      "begin_line": 78,
      "end_line": 100,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getValues()\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 33)",
        "(line 87,col 9)-(line 91,col 9)",
        "(line 94,col 9)-(line 94,col 50)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getElement(int)",
      "begin_line": 105,
      "end_line": 125,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getElement(int)\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 34)",
        "(line 109,col 9)-(line 109,col 30)",
        "(line 111,col 9)-(line 115,col 9)",
        "(line 118,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getN()",
      "begin_line": 130,
      "end_line": 143,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getN()\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 18)",
        "(line 133,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.addValue(double)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#addValue(double)\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.addObject(java.lang.Object)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Adds an object to this list. \n     * @param o Object to add to the list\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.clear()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Clears all statistics.\n     * \u003cp\u003e\n     * \u003cstrong\u003eN.B.: \u003c/strong\u003e This method has the side effect of clearing the underlying list.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 174,
      "end_line": 181,
      "comment": "\n     * Apply the given statistic to this univariate collection.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 38)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getTransformer()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Access the number transformer.\n     * @return the number transformer.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.setTransformer(org.apache.commons.math.util.NumberTransformer)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Modify the number transformer.\n     * @param transformer the new number transformer.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.setWindowSize(int)",
      "begin_line": 202,
      "end_line": 210,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#setWindowSize(int)\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 37)",
        "(line 206,col 9)-(line 206,col 45)",
        "(line 207,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getWindowSize()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getWindowSize\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 26)"
      ]
    }
  ]
}