{
  "filepath": "/tmp/Math-97b/src/test/org/apache/commons/math/stat/regression/AbstractMultipleLinearRegressionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultipleLinearRegressionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "regression"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegressionTest.setUp()",
      "begin_line": 30,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegressionTest.createRegression()",
      "begin_line": 35,
      "end_line": 35,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegressionTest.getNumberOfRegressors()",
      "begin_line": 37,
      "end_line": 37,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegressionTest.getSampleSize()",
      "begin_line": 39,
      "end_line": 39,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegressionTest.canEstimateRegressionParameters()",
      "begin_line": 41,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 66)",
        "(line 44,col 9)-(line 44,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegressionTest.canEstimateResiduals()",
      "begin_line": 47,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 52)",
        "(line 50,col 9)-(line 50,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegressionTest.canEstimateRegressionParametersVariance()",
      "begin_line": 53,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 80)",
        "(line 56,col 9)-(line 56,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegressionTest.canEstimateRegressandVariance()",
      "begin_line": 59,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 66)",
        "(line 62,col 9)-(line 62,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegressionTest.cannotAddXSampleData()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegressionTest.cannotAddNullYSampleData()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegressionTest.cannotAddSampleDataWithSizeMismatch()",
      "begin_line": 75,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 44)",
        "(line 78,col 9)-(line 78,col 39)",
        "(line 79,col 9)-(line 79,col 36)",
        "(line 80,col 9)-(line 80,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegressionTest.loadModelData(double[], double[], double[][], int, int)",
      "begin_line": 93,
      "end_line": 103,
      "comment": "\n     * Loads model Y[] and X[][] arrays from a flat array of data.\n     * Assumes that rows are concatenated with y values first in each row.\n     * \n     * @param data input data array\n     * @param y vector of y values to be filled\n     * @param x matrix of x values to be filled\n     * @param nobs number of observations (rows)\n     * @param nvars number of independent variables (columnns, not counting y)\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 24)",
        "(line 95,col 9)-(line 101,col 9)"
      ]
    }
  ]
}