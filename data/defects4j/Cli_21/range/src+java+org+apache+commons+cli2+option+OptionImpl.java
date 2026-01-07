{
  "filepath": "/tmp/Cli-21b/src/java/org/apache/commons/cli2/option/OptionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.Option"
      ],
      "begin_line": 33,
      "end_line": 170,
      "comment": "\n * A base implementation of Option providing limited ground work for further\n * Option implementations.\n "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.OptionImpl.OptionImpl(int, boolean)",
      "begin_line": 43,
      "end_line": 47,
      "comment": "\n     * Creates an OptionImpl with the specified id\n     * @param id the unique id of this Option\n     * @param required true iff this Option must be present\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 21)",
        "(line 46,col 9)-(line 46,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.canProcess(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)",
      "begin_line": 49,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 58,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.toString()",
      "begin_line": 61,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 55)",
        "(line 63,col 9)-(line 63,col 54)",
        "(line 65,col 9)-(line 65,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.getId()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.equals(java.lang.Object)",
      "begin_line": 72,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 83,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.equals(java.lang.Object, java.lang.Object)",
      "begin_line": 86,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.hashCode()",
      "begin_line": 97,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 31)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 62)",
        "(line 108,col 9)-(line 108,col 62)",
        "(line 110,col 9)-(line 110,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.findOption(java.lang.String)",
      "begin_line": 113,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.isRequired()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.defaults(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.getParent()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.setParent(org.apache.commons.cli2.Option)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.checkPrefixes(java.util.Set)",
      "begin_line": 137,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 144,col 9)-(line 144,col 50)",
        "(line 147,col 9)-(line 147,col 27)",
        "(line 149,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.checkPrefix(java.util.Set, java.lang.String)",
      "begin_line": 154,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 164,col 73)",
        "(line 165,col 9)-(line 167,col 51)",
        "(line 168,col 9)-(line 168,col 52)"
      ]
    }
  ]
}