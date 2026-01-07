{
  "filepath": "/tmp/Cli-13b/src/java/org/apache/commons/cli2/option/OptionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.Option"
      ],
      "begin_line": 33,
      "end_line": 159,
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
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.OptionImpl.OptionImpl(int, boolean)",
      "begin_line": 42,
      "end_line": 46,
      "comment": "\n     * Creates an OptionImpl with the specified id\n     * @param id the unique id of this Option\n     * @param required true iff this Option must be present\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 21)",
        "(line 45,col 9)-(line 45,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.canProcess(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)",
      "begin_line": 48,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 57,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.toString()",
      "begin_line": 60,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 55)",
        "(line 62,col 9)-(line 62,col 54)",
        "(line 64,col 9)-(line 64,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.getId()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.equals(java.lang.Object)",
      "begin_line": 71,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.equals(java.lang.Object, java.lang.Object)",
      "begin_line": 85,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.hashCode()",
      "begin_line": 96,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 31)",
        "(line 98,col 9)-(line 98,col 67)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 62)",
        "(line 105,col 9)-(line 105,col 62)",
        "(line 107,col 9)-(line 107,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.findOption(java.lang.String)",
      "begin_line": 110,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.isRequired()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.defaults(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.checkPrefixes(java.util.Set)",
      "begin_line": 126,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 133,col 9)-(line 133,col 50)",
        "(line 136,col 9)-(line 136,col 27)",
        "(line 138,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.checkPrefix(java.util.Set, java.lang.String)",
      "begin_line": 143,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 153,col 73)",
        "(line 154,col 9)-(line 156,col 51)",
        "(line 157,col 9)-(line 157,col 52)"
      ]
    }
  ]
}