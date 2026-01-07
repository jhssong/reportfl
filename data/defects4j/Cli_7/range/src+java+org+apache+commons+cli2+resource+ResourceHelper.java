{
  "filepath": "/tmp/Cli-7b/src/java/org/apache/commons/cli2/resource/ResourceHelper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ResourceHelper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 160,
      "comment": "\n * A utility class used to provide internationalisation support.\n *\n * @author John Keyes\n "
    },
    {
      "type": "field",
      "varNames": [
        "PROP_LOCALE"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " system property "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BUNDLE"
      ],
      "begin_line": 35,
      "end_line": 36,
      "comment": " default package name "
    },
    {
      "type": "field",
      "varNames": [
        "helper"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bundle"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " resource bundle "
    },
    {
      "type": "field",
      "varNames": [
        "prop"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.resource.ResourceHelper.ResourceHelper()",
      "begin_line": 47,
      "end_line": 74,
      "comment": "\n     * Create a new ResourceHelper for the current locale.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 60)",
        "(line 50,col 9)-(line 52,col 9)",
        "(line 54,col 9)-(line 54,col 31)",
        "(line 56,col 9)-(line 56,col 54)",
        "(line 57,col 9)-(line 57,col 76)",
        "(line 59,col 9)-(line 59,col 22)",
        "(line 60,col 9)-(line 67,col 9)",
        "(line 69,col 9)-(line 73,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.resource.ResourceHelper.getBundleName()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 6)-(line 77,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.resource.ResourceHelper.getResourceHelper()",
      "begin_line": 84,
      "end_line": 91,
      "comment": "\n     * Gets the ResourceHelper appropriate to the current locale.\n     * @return a ResourceHelper\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 60)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.resource.ResourceHelper.getMessage(java.lang.String)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Returns the message for the specified key.\n     *\n     * @param key the unique identifier of the message\n     * @return String the formatted String\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.resource.ResourceHelper.getMessage(java.lang.String, java.lang.Object)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Returns the message for the specified key and argument.\n     *\n     * @param key the unique identifier of the message\n     * @param value the argument value\n     * @return String the formatted String\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.resource.ResourceHelper.getMessage(java.lang.String, java.lang.Object, java.lang.Object)",
      "begin_line": 123,
      "end_line": 127,
      "comment": "\n     * Returns the message for the specified key and arguments.\n     *\n     * @param key the unique identifier of the message\n     * @param value1 an argument value\n     * @param value2 an argument value\n     * @return String the formatted String\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.resource.ResourceHelper.getMessage(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 139,
      "end_line": 144,
      "comment": "\n     * Returns the message for the specified key and arguments.\n     *\n     * @param key the unique identifier of the message\n     * @param value1 an argument value\n     * @param value2 an argument value\n     * @param value3 an argument value\n     *\n     * @return String the formatted String\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.resource.ResourceHelper.getMessage(java.lang.String, java.lang.Object[])",
      "begin_line": 153,
      "end_line": 159,
      "comment": "\n     * Returns the message for the specified key and arguments.\n     *\n     * @param key the unique identifier of the message\n     * @param values argument values\n     * @return String the formatted String\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 58)",
        "(line 156,col 9)-(line 156,col 72)",
        "(line 158,col 9)-(line 158,col 40)"
      ]
    }
  ]
}