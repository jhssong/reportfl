{
  "filepath": "/tmp/Compress-16b/src/main/java/org/apache/commons/compress/compressors/bzip2/CRC.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CRC",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 134,
      "comment": "\n * A simple class the hold and calculate the CRC for sanity checking of the\n * data.\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "crc32Table"
      ],
      "begin_line": 27,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.CRC.CRC()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.CRC.initialiseCRC()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 13)-(line 99,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.CRC.getFinalCRC()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.CRC.getGlobalCRC()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.CRC.setGlobalCRC(int)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.CRC.updateCRC(int)",
      "begin_line": 114,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 48)",
        "(line 116,col 13)-(line 118,col 13)",
        "(line 119,col 13)-(line 119,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.CRC.updateCRC(int, int)",
      "begin_line": 122,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 123,col 13)-(line 123,col 49)",
        "(line 124,col 13)-(line 129,col 13)",
        "(line 130,col 13)-(line 130,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "globalCrc"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    }
  ]
}