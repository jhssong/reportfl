{
  "filepath": "/tmp/Cli-16b/src/java/org/apache/commons/cli2/option/OptionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.Option"
      ],
      "begin_line": 33,
      "end_line": 163,
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
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 31)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 62)",
        "(line 107,col 9)-(line 107,col 62)",
        "(line 109,col 9)-(line 109,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.findOption(java.lang.String)",
      "begin_line": 112,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.isRequired()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.defaults(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.checkPrefixes(java.util.Set)",
      "begin_line": 130,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 137,col 9)-(line 137,col 50)",
        "(line 140,col 9)-(line 140,col 27)",
        "(line 142,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.OptionImpl.checkPrefix(java.util.Set, java.lang.String)",
      "begin_line": 147,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 73)",
        "(line 158,col 9)-(line 160,col 51)",
        "(line 161,col 9)-(line 161,col 52)"
      ]
    }
  ]
}