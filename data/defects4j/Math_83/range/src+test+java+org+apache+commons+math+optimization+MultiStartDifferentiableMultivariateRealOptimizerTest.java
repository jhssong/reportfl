{
  "filepath": "/tmp/Math-83b/src/test/java/org/apache/commons/math/optimization/MultiStartDifferentiableMultivariateRealOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartDifferentiableMultivariateRealOptimizerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizerTest.testCircleFitting()",
      "begin_line": 41,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 37)",
        "(line 44,col 9)-(line 44,col 38)",
        "(line 45,col 9)-(line 45,col 38)",
        "(line 46,col 9)-(line 46,col 38)",
        "(line 47,col 9)-(line 47,col 38)",
        "(line 48,col 9)-(line 48,col 38)",
        "(line 49,col 9)-(line 50,col 92)",
        "(line 51,col 9)-(line 51,col 56)",
        "(line 52,col 9)-(line 52,col 33)",
        "(line 53,col 9)-(line 55,col 82)",
        "(line 56,col 9)-(line 57,col 93)",
        "(line 58,col 9)-(line 58,col 40)",
        "(line 59,col 9)-(line 59,col 56)",
        "(line 60,col 9)-(line 60,col 41)",
        "(line 61,col 9)-(line 61,col 57)",
        "(line 62,col 9)-(line 62,col 88)",
        "(line 63,col 9)-(line 63,col 47)",
        "(line 64,col 9)-(line 64,col 44)",
        "(line 65,col 9)-(line 65,col 44)",
        "(line 66,col 9)-(line 67,col 91)",
        "(line 68,col 9)-(line 68,col 60)",
        "(line 69,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 61)",
        "(line 76,col 9)-(line 76,col 61)",
        "(line 77,col 9)-(line 77,col 52)",
        "(line 78,col 9)-(line 78,col 52)",
        "(line 79,col 9)-(line 79,col 51)",
        "(line 80,col 9)-(line 80,col 51)",
        "(line 81,col 9)-(line 81,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction"
      ],
      "begin_line": 84,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizerTest.Circle.Circle()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 13)-(line 89,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizerTest.Circle.addPoint(double, double)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizerTest.Circle.getRadius(java.awt.geom.Point2D.Double)",
      "begin_line": 96,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 25)",
        "(line 98,col 13)-(line 100,col 13)",
        "(line 101,col 13)-(line 101,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizerTest.Circle.gradient(double[])",
      "begin_line": 104,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 75)",
        "(line 108,col 13)-(line 108,col 46)",
        "(line 111,col 13)-(line 111,col 28)",
        "(line 112,col 13)-(line 112,col 28)",
        "(line 113,col 13)-(line 117,col 13)",
        "(line 118,col 13)-(line 118,col 22)",
        "(line 119,col 13)-(line 119,col 22)",
        "(line 121,col 13)-(line 121,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizerTest.Circle.value(double[])",
      "begin_line": 125,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 128,col 13)-(line 128,col 83)",
        "(line 129,col 13)-(line 129,col 46)",
        "(line 131,col 13)-(line 131,col 27)",
        "(line 132,col 13)-(line 135,col 13)",
        "(line 137,col 13)-(line 137,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizerTest.Circle.gradient()",
      "begin_line": 141,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 142,col 13)-(line 146,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizerTest.Circle.Anonymous-808c7dc1-244b-46f1-b0bc-2c224a9c556c.value(double[])",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 21)-(line 144,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizerTest.Circle.partialDerivative(int)",
      "begin_line": 149,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 150,col 13)-(line 154,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizerTest.Circle.Anonymous-d9c3c110-45eb-456e-ba5d-c389ac9ee562.value(double[])",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 21)-(line 152,col 46)"
      ]
    }
  ]
}