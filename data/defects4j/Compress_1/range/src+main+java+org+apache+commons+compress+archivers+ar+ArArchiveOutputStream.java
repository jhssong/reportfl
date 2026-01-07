{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 30,
      "end_line": 164,
      "comment": "\n * Implements the \"ar\" archive format as an output stream\n "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archiveOffset"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevEntry"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.ArArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeArchiveHeader()",
      "begin_line": 41,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 42)",
        "(line 43,col 9)-(line 43,col 37)",
        "(line 44,col 9)-(line 44,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 47,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 51,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 54,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 57)",
        "(line 56,col 9)-(line 64,col 9)",
        "(line 66,col 9)-(line 66,col 29)",
        "(line 68,col 9)-(line 68,col 52)",
        "(line 70,col 9)-(line 70,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.fill(long, long, char)",
      "begin_line": 73,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 47)",
        "(line 76,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 82,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(java.lang.String)",
      "begin_line": 85,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 52)",
        "(line 87,col 9)-(line 87,col 21)",
        "(line 88,col 9)-(line 88,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeEntryHeader(org.apache.commons.compress.archivers.ar.ArArchiveEntry)",
      "begin_line": 91,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 24)",
        "(line 95,col 9)-(line 95,col 42)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 27)",
        "(line 101,col 9)-(line 101,col 39)",
        "(line 102,col 9)-(line 102,col 64)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 27)",
        "(line 108,col 9)-(line 108,col 39)",
        "(line 109,col 9)-(line 109,col 49)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 27)",
        "(line 115,col 9)-(line 115,col 39)",
        "(line 116,col 9)-(line 116,col 50)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 27)",
        "(line 122,col 9)-(line 122,col 39)",
        "(line 123,col 9)-(line 123,col 69)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 28)",
        "(line 129,col 9)-(line 129,col 39)",
        "(line 130,col 9)-(line 130,col 49)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 27)",
        "(line 136,col 9)-(line 136,col 39)",
        "(line 138,col 9)-(line 138,col 33)",
        "(line 140,col 9)-(line 140,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(int)",
      "begin_line": 143,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 21)",
        "(line 145,col 9)-(line 145,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 31)",
        "(line 150,col 9)-(line 150,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(byte[])",
      "begin_line": 153,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 21)",
        "(line 155,col 9)-(line 155,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.close()",
      "begin_line": 158,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 28)",
        "(line 160,col 9)-(line 160,col 20)",
        "(line 161,col 9)-(line 161,col 25)"
      ]
    }
  ]
}