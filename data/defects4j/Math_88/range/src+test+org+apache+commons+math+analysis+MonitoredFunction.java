{
  "filepath": "/tmp/Math-88b/src/test/org/apache/commons/math/analysis/MonitoredFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MonitoredFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 53,
      "comment": "\n * Wrapper class for counting functions calls.\n *\n * @version $Revision$ $Date$ \n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.MonitoredFunction.MonitoredFunction(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 32,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 23)",
        "(line 34,col 9)-(line 34,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.MonitoredFunction.setCallsCount(int)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.MonitoredFunction.getCallsCount()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.MonitoredFunction.value(double)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 21)",
        "(line 47,col 9)-(line 47,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "callsCount"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    }
  ]
}