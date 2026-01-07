{
  "filepath": "/tmp/JxPath-14b/src/java/org/apache/commons/jxpath/FunctionLibrary.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionLibrary",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Functions"
      ],
      "begin_line": 34,
      "end_line": 125,
      "comment": "\n * An object that aggregates Functions objects into a group Functions object.\n * Since JXPathContext can only register a single Functions object,\n * FunctionLibrary should always be used to group all Functions objects\n * that need to be registered.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "allFunctions"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byNamespace"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.addFunctions(org.apache.commons.jxpath.Functions)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     * Add functions to the library\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 36)",
        "(line 43,col 9)-(line 43,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.removeFunctions(org.apache.commons.jxpath.Functions)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Remove functions from the library.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 39)",
        "(line 51,col 9)-(line 51,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.getUsedNamespaces()",
      "begin_line": 58,
      "end_line": 63,
      "comment": "\n     * Returns a set containing all namespaces used by the aggregated\n     * Functions.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.getFunction(java.lang.String, java.lang.String, java.lang.Object[])",
      "begin_line": 69,
      "end_line": 99,
      "comment": "\n     * Returns a Function, if any, for the specified namespace,\n     * name and parameter types.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 55)",
        "(line 78,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.prepareCache()",
      "begin_line": 101,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 36)",
        "(line 103,col 9)-(line 103,col 40)",
        "(line 104,col 9)-(line 123,col 9)"
      ]
    }
  ]
}