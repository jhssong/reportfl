{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/util/FastMathStrictComparisonTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMathStrictComparisonTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 248,
      "comment": "\n * Test to compare FastMath results against StrictMath results for boundary values.\n * \u003cp\u003e\n * Running all tests independently: \u003cbr/\u003e\n * {@code mvn test -Dtest\u003dFastMathStrictComparisonTest}\u003cbr/\u003e\n * or just run tests against a single method (e.g. scalb):\u003cbr/\u003e\n * {@code mvn test -Dtest\u003dFastMathStrictComparisonTest -DargLine\u003d\"-DtestMethod\u003dscalb\"}\n "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_SPECIAL_VALUES"
      ],
      "begin_line": 45,
      "end_line": 54,
      "comment": " Values which often need special handling"
    },
    {
      "type": "field",
      "varNames": [
        "FLOAT_SPECIAL_VALUES"
      ],
      "begin_line": 56,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LONG_SPECIAL_VALUES"
      ],
      "begin_line": 64,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INT_SPECIAL_VALUES"
      ],
      "begin_line": 69,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mathMethod"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fastMethod"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "types"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "valueArrays"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.FastMathStrictComparisonTest(java.lang.reflect.Method, java.lang.reflect.Method, java.lang.reflect.Type[], java.lang.Object[][])",
      "begin_line": 79,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 26)",
        "(line 81,col 9)-(line 81,col 26)",
        "(line 82,col 9)-(line 82,col 25)",
        "(line 83,col 9)-(line 83,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.test1()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.isNumber(java.lang.Double)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.isNumber(java.lang.Float)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.reportFailedResults(java.lang.reflect.Method, java.lang.Object[], java.lang.Object, java.lang.Object, int[])",
      "begin_line": 98,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 55)",
        "(line 100,col 9)-(line 100,col 29)",
        "(line 101,col 9)-(line 101,col 20)",
        "(line 102,col 9)-(line 102,col 20)",
        "(line 103,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 47)",
        "(line 127,col 9)-(line 127,col 62)",
        "(line 128,col 9)-(line 128,col 23)",
        "(line 129,col 9)-(line 129,col 30)",
        "(line 130,col 9)-(line 130,col 23)",
        "(line 131,col 9)-(line 131,col 24)",
        "(line 132,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 33)",
        "(line 138,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 30)",
        "(line 144,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 31)",
        "(line 150,col 9)-(line 150,col 44)",
        "(line 151,col 9)-(line 151,col 39)",
        "(line 152,col 9)-(line 152,col 35)",
        "(line 153,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.callMethods(java.lang.reflect.Method, java.lang.reflect.Method, java.lang.Object[], int[])",
      "begin_line": 160,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.setupMethodCall(java.lang.reflect.Method, java.lang.reflect.Method, java.lang.reflect.Type[], java.lang.Object[][])",
      "begin_line": 174,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 51)",
        "(line 177,col 9)-(line 177,col 23)",
        "(line 178,col 9)-(line 178,col 46)",
        "(line 179,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.data()",
      "begin_line": 197,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 63)",
        "(line 200,col 9)-(line 200,col 56)",
        "(line 201,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 20)"
      ]
    }
  ]
}