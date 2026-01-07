{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/stat/descriptive/ListUnivariateImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ListUnivariateImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 206,
      "comment": "\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math3.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * No argument Constructor\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl(java.util.List\u003cjava.lang.Object\u003e)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Construct a ListUnivariate with a specific List.\n     * @param list The list that will back this DescriptiveStatistics\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.ListUnivariateImpl.ListUnivariateImpl(java.util.List\u003cjava.lang.Object\u003e, org.apache.commons.math3.util.NumberTransformer)",
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
      "signature": "org.apache.commons.math3.stat.descriptive.ListUnivariateImpl.getValues()",
      "begin_line": 74,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 33)",
        "(line 84,col 9)-(line 84,col 42)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 90,col 9)-(line 90,col 50)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.ListUnivariateImpl.getElement(int)",
      "begin_line": 99,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 34)",
        "(line 104,col 9)-(line 104,col 30)",
        "(line 106,col 9)-(line 106,col 42)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 112,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.ListUnivariateImpl.getN()",
      "begin_line": 122,
      "end_line": 137,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 18)",
        "(line 126,col 9)-(line 126,col 42)",
        "(line 127,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.ListUnivariateImpl.addValue(double)",
      "begin_line": 140,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.ListUnivariateImpl.addObject(java.lang.Object)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Adds an object to this list.\n     * @param o Object to add to the list\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.ListUnivariateImpl.clear()",
      "begin_line": 158,
      "end_line": 161,
      "comment": "\n     * Clears all statistics.\n     * \u003cp\u003e\n     * \u003cstrong\u003eN.B.: \u003c/strong\u003e This method has the side effect of clearing the underlying list.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.ListUnivariateImpl.apply(org.apache.commons.math3.stat.descriptive.UnivariateStatistic)",
      "begin_line": 168,
      "end_line": 176,
      "comment": "\n     * Apply the given statistic to this univariate collection.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 38)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.ListUnivariateImpl.getTransformer()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * Access the number transformer.\n     * @return the number transformer.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.ListUnivariateImpl.setTransformer(org.apache.commons.math3.util.NumberTransformer)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Modify the number transformer.\n     * @param transformer the new number transformer.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.ListUnivariateImpl.setWindowSize(int)",
      "begin_line": 195,
      "end_line": 204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 40)",
        "(line 200,col 9)-(line 200,col 45)",
        "(line 201,col 9)-(line 203,col 9)"
      ]
    }
  ]
}