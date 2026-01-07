{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/stat/regression/MultipleLinearRegressionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultipleLinearRegressionAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "regression"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.setUp()",
      "begin_line": 31,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.createRegression()",
      "begin_line": 36,
      "end_line": 36,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.getNumberOfRegressors()",
      "begin_line": 38,
      "end_line": 38,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.getSampleSize()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.canEstimateRegressionParameters()",
      "begin_line": 42,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 66)",
        "(line 45,col 9)-(line 45,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.canEstimateResiduals()",
      "begin_line": 48,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 52)",
        "(line 51,col 9)-(line 51,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.canEstimateRegressionParametersVariance()",
      "begin_line": 54,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 80)",
        "(line 57,col 9)-(line 57,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.canEstimateRegressandVariance()",
      "begin_line": 60,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 65,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.testNewSample()",
      "begin_line": 72,
      "end_line": 105,
      "comment": "\n     * Verifies that newSampleData methods consistently insert unitary columns\n     * in design matrix.  Confirms the fix for MATH-411.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 79,col 10)",
        "(line 80,col 9)-(line 80,col 47)",
        "(line 81,col 9)-(line 86,col 10)",
        "(line 87,col 9)-(line 87,col 73)",
        "(line 88,col 9)-(line 88,col 47)",
        "(line 89,col 9)-(line 89,col 52)",
        "(line 90,col 9)-(line 90,col 52)",
        "(line 91,col 9)-(line 91,col 37)",
        "(line 92,col 9)-(line 92,col 37)",
        "(line 93,col 9)-(line 93,col 54)",
        "(line 94,col 9)-(line 94,col 54)",
        "(line 97,col 9)-(line 97,col 40)",
        "(line 98,col 9)-(line 98,col 47)",
        "(line 99,col 9)-(line 99,col 41)",
        "(line 100,col 9)-(line 100,col 41)",
        "(line 101,col 9)-(line 101,col 37)",
        "(line 102,col 9)-(line 102,col 37)",
        "(line 103,col 9)-(line 103,col 54)",
        "(line 104,col 9)-(line 104,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.testNewSampleNullData()",
      "begin_line": 107,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 29)",
        "(line 110,col 9)-(line 110,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.testNewSampleInvalidData()",
      "begin_line": 113,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 50)",
        "(line 116,col 9)-(line 116,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.testNewSampleInsufficientData()",
      "begin_line": 119,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 50)",
        "(line 122,col 9)-(line 122,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.testXSampleDataNull()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.testYSampleDataNull()",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 48)"
      ]
    }
  ]
}