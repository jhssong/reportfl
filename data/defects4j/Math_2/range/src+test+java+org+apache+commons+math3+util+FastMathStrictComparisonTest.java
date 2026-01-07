{
  "filepath": "/tmp/Math-2b/src/test/java/org/apache/commons/math3/util/FastMathStrictComparisonTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMathStrictComparisonTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 249,
      "comment": "\n * Test to compare FastMath results against StrictMath results for boundary values.\n * \u003cp\u003e\n * Running all tests independently: \u003cbr/\u003e\n * {@code mvn test -Dtest\u003dFastMathStrictComparisonTest}\u003cbr/\u003e\n * or just run tests against a single method (e.g. scalb):\u003cbr/\u003e\n * {@code mvn test -Dtest\u003dFastMathStrictComparisonTest -DargLine\u003d\"-DtestMethod\u003dscalb\"}\n "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_SPECIAL_VALUES"
      ],
      "begin_line": 46,
      "end_line": 55,
      "comment": " Values which often need special handling"
    },
    {
      "type": "field",
      "varNames": [
        "FLOAT_SPECIAL_VALUES"
      ],
      "begin_line": 57,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LONG_SPECIAL_VALUES"
      ],
      "begin_line": 65,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INT_SPECIAL_VALUES"
      ],
      "begin_line": 70,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mathMethod"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fastMethod"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "types"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "valueArrays"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.FastMathStrictComparisonTest(java.lang.reflect.Method, java.lang.reflect.Method, java.lang.reflect.Type[], java.lang.Object[][])",
      "begin_line": 80,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 26)",
        "(line 82,col 9)-(line 82,col 26)",
        "(line 83,col 9)-(line 83,col 25)",
        "(line 84,col 9)-(line 84,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.test1()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.isNumber(java.lang.Double)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.isNumber(java.lang.Float)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.reportFailedResults(java.lang.reflect.Method, java.lang.Object[], java.lang.Object, java.lang.Object, int[])",
      "begin_line": 99,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 55)",
        "(line 101,col 9)-(line 101,col 29)",
        "(line 102,col 9)-(line 102,col 20)",
        "(line 103,col 9)-(line 103,col 20)",
        "(line 104,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 47)",
        "(line 128,col 9)-(line 128,col 62)",
        "(line 129,col 9)-(line 129,col 23)",
        "(line 130,col 9)-(line 130,col 30)",
        "(line 131,col 9)-(line 131,col 23)",
        "(line 132,col 9)-(line 132,col 24)",
        "(line 133,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 33)",
        "(line 139,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 30)",
        "(line 145,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 31)",
        "(line 151,col 9)-(line 151,col 44)",
        "(line 152,col 9)-(line 152,col 39)",
        "(line 153,col 9)-(line 153,col 35)",
        "(line 154,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.callMethods(java.lang.reflect.Method, java.lang.reflect.Method, java.lang.Object[], int[])",
      "begin_line": 161,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 172,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.setupMethodCall(java.lang.reflect.Method, java.lang.reflect.Method, java.lang.reflect.Type[], java.lang.Object[][])",
      "begin_line": 175,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 51)",
        "(line 178,col 9)-(line 178,col 23)",
        "(line 179,col 9)-(line 179,col 46)",
        "(line 180,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathStrictComparisonTest.data()",
      "begin_line": 198,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 63)",
        "(line 201,col 9)-(line 201,col 56)",
        "(line 202,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 20)"
      ]
    }
  ]
}