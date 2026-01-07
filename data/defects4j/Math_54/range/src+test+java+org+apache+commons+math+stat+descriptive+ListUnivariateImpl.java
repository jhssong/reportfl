{
  "filepath": "/tmp/Math-54b/src/test/java/org/apache/commons/math/stat/descriptive/ListUnivariateImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ListUnivariateImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.DescriptiveStatistics",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 213,
      "comment": "\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Holds a reference to a list - GENERICs are going to make\n     * our lives easier here as we could only accept List\u003cNumber\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Number Transformer maps Objects to Number for us. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * No argument Constructor\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl(java.util.List\u003cjava.lang.Object\u003e)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Construct a ListUnivariate with a specific List.\n     * @param list The list that will back this DescriptiveStatistics\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl(java.util.List\u003cjava.lang.Object\u003e, org.apache.commons.math.util.NumberTransformer)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * Construct a ListUnivariate with a specific List.\n     * @param list The list that will back this DescriptiveStatistics\n     * @param transformer the number transformer used to convert the list items.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 16)",
        "(line 69,col 9)-(line 69,col 25)",
        "(line 70,col 9)-(line 70,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getValues()",
      "begin_line": 74,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
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
      "begin_line": 100,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 34)",
        "(line 105,col 9)-(line 105,col 30)",
        "(line 107,col 9)-(line 111,col 9)",
        "(line 114,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 120,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getN()",
      "begin_line": 124,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 18)",
        "(line 128,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.addValue(double)",
      "begin_line": 141,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.addObject(java.lang.Object)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Adds an object to this list.\n     * @param o Object to add to the list\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.clear()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "\n     * Clears all statistics.\n     * \u003cp\u003e\n     * \u003cstrong\u003eN.B.: \u003c/strong\u003e This method has the side effect of clearing the underlying list.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 169,
      "end_line": 177,
      "comment": "\n     * Apply the given statistic to this univariate collection.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 38)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getTransformer()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Access the number transformer.\n     * @return the number transformer.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.setTransformer(org.apache.commons.math.util.NumberTransformer)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Modify the number transformer.\n     * @param transformer the new number transformer.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.setWindowSize(int)",
      "begin_line": 196,
      "end_line": 205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 37)",
        "(line 201,col 9)-(line 201,col 45)",
        "(line 202,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.ListUnivariateImpl.getWindowSize()",
      "begin_line": 208,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 26)"
      ]
    }
  ]
}