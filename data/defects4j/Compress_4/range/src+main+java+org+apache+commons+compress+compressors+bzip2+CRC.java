{
  "filepath": "/tmp/Compress-4b/src/main/java/org/apache/commons/compress/compressors/bzip2/CRC.java",
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
        "(line 95,col 10)-(line 95,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.CRC.initialiseCRC()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 10)-(line 99,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.CRC.getFinalCRC()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 10)-(line 103,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.CRC.getGlobalCRC()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 10)-(line 107,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.CRC.setGlobalCRC(int)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 10)-(line 111,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.CRC.updateCRC(int)",
      "begin_line": 114,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 115,col 10)-(line 115,col 45)",
        "(line 116,col 10)-(line 118,col 10)",
        "(line 119,col 10)-(line 119,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.CRC.updateCRC(int, int)",
      "begin_line": 122,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 123,col 10)-(line 123,col 46)",
        "(line 124,col 10)-(line 129,col 10)",
        "(line 130,col 10)-(line 130,col 42)"
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