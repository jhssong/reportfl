{
  "filepath": "/tmp/Math-37b/src/test/java/org/apache/commons/math/util/FastMathLoadCheck.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMathLoadCheck",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 120,
      "comment": "\n * FastMath load performance test - requires that\n * \u003cul\u003e\n *  \u003cli\u003e{@code FastMath.RECOMPUTE_TABLES_AT_RUNTIME}\u003c/li\u003e\n *  \u003cli\u003e{@code FastMath.LOAD_RESOURCES}\u003c/li\u003e\n * \u003c/ul\u003e\n * be non-\"final\".\n * \n * For example, this shell command:\n * \u003cpre\u003e\n *  $ for max in false true ; do for how in compute resources array; do java -cp target/classes:target/test-classes org.apache.commons.math.util.FastMathLoadCheck $max $how 4 ; done ; done\n * \u003c/pre\u003e\n * will produce an output similar to the following:\n * \u003cpre\u003e\n * Using exp(100); how\u003dcomputeUsing exp(100); how\u003dcompute\n *     times       result\n *  43534147 2.688117e+43\n *      4547 2.688117e+43\n *      1970 2.688117e+43\n *      1823 2.688117e+43\n *\n * Using exp(100); how\u003darray\n *     times       result\n *  12596573 2.688117e+43\n *      4484 2.688117e+43\n *      1861 2.688117e+43\n *      1864 2.688117e+43\n *\n * Using exp(100); how\u003dresources\n *     times       result\n *  13087186 2.688117e+43\n *      4974 2.688117e+43\n *      1834 2.688117e+43\n *      1900 2.688117e+43\n *\n * Using max(0,0); how\u003dcompute\n *     times       result\n *      3172 0.000000e+00\n *       692 0.000000e+00\n *       385 0.000000e+00\n *       358 0.000000e+00\n *\n * Using max(0,0); how\u003darray\n *     times       result\n *      2746 0.000000e+00\n *       527 0.000000e+00\n *       382 0.000000e+00\n *       390 0.000000e+00\n *\n * Using max(0,0); how\u003dresources\n *     times       result\n *      3762 0.000000e+00\n *       506 0.000000e+00\n *       394 0.000000e+00\n *       364 0.000000e+00\n * \u003c/pre\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "COMP"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RES"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ARR"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOOPS"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "how"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathLoadCheck.main(java.lang.String[])",
      "begin_line": 71,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 60)",
        "(line 73,col 9)-(line 73,col 43)",
        "(line 74,col 9)-(line 74,col 62)",
        "(line 75,col 9)-(line 75,col 77)",
        "(line 77,col 9)-(line 77,col 95)",
        "(line 78,col 9)-(line 78,col 77)",
        "(line 79,col 9)-(line 79,col 38)",
        "(line 80,col 9)-(line 80,col 33)",
        "(line 81,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 39)",
        "(line 94,col 9)-(line 94,col 34)",
        "(line 96,col 9)-(line 96,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathLoadCheck.test()",
      "begin_line": 98,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 43)",
        "(line 100,col 9)-(line 100,col 22)",
        "(line 101,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathLoadCheck.p(java.lang.String, java.lang.Object...)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathLoadCheck.p(java.lang.Object)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 28)"
      ]
    }
  ]
}