{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 32,
      "end_line": 169,
      "comment": "\n * Implements the \"ar\" archive format as an output stream.\n * \n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archiveOffset"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevEntry"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "haveUnclosedEntry"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.ArArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeArchiveHeader()",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 58)",
        "(line 46,col 9)-(line 46,col 26)",
        "(line 47,col 9)-(line 47,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 50,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 58,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 57)",
        "(line 60,col 9)-(line 68,col 9)",
        "(line 70,col 9)-(line 70,col 29)",
        "(line 72,col 9)-(line 72,col 52)",
        "(line 74,col 9)-(line 74,col 24)",
        "(line 75,col 9)-(line 75,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.fill(long, long, char)",
      "begin_line": 78,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 47)",
        "(line 81,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(java.lang.String)",
      "begin_line": 90,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 52)",
        "(line 92,col 9)-(line 92,col 21)",
        "(line 93,col 9)-(line 93,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeEntryHeader(org.apache.commons.compress.archivers.ar.ArArchiveEntry)",
      "begin_line": 96,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 24)",
        "(line 100,col 9)-(line 100,col 42)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 27)",
        "(line 106,col 9)-(line 106,col 39)",
        "(line 107,col 9)-(line 107,col 64)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 27)",
        "(line 113,col 9)-(line 113,col 39)",
        "(line 114,col 9)-(line 114,col 49)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 27)",
        "(line 120,col 9)-(line 120,col 39)",
        "(line 121,col 9)-(line 121,col 50)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 27)",
        "(line 127,col 9)-(line 127,col 39)",
        "(line 128,col 9)-(line 128,col 69)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 28)",
        "(line 134,col 9)-(line 134,col 39)",
        "(line 135,col 9)-(line 135,col 49)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 27)",
        "(line 141,col 9)-(line 141,col 39)",
        "(line 143,col 9)-(line 143,col 48)",
        "(line 145,col 9)-(line 145,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(int)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 21)",
        "(line 150,col 9)-(line 150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 31)",
        "(line 155,col 9)-(line 155,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(byte[])",
      "begin_line": 158,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 21)",
        "(line 160,col 9)-(line 160,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.close()",
      "begin_line": 163,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 28)",
        "(line 165,col 9)-(line 165,col 20)",
        "(line 166,col 9)-(line 166,col 25)"
      ]
    }
  ]
}