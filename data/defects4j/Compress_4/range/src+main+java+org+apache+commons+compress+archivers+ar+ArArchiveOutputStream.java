{
  "filepath": "/tmp/Compress-4b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 34,
      "end_line": 173,
      "comment": "\n * Implements the \"ar\" archive format as an output stream.\n * \n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archiveOffset"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevEntry"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "haveUnclosedEntry"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.ArArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeArchiveHeader()",
      "begin_line": 46,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 74)",
        "(line 48,col 9)-(line 48,col 26)",
        "(line 49,col 9)-(line 49,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 52,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 60,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 57)",
        "(line 62,col 9)-(line 70,col 9)",
        "(line 72,col 9)-(line 72,col 29)",
        "(line 74,col 9)-(line 74,col 52)",
        "(line 76,col 9)-(line 76,col 24)",
        "(line 77,col 9)-(line 77,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.fill(long, long, char)",
      "begin_line": 80,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 47)",
        "(line 83,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(java.lang.String)",
      "begin_line": 92,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 52)",
        "(line 94,col 9)-(line 94,col 21)",
        "(line 95,col 9)-(line 95,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeEntryHeader(org.apache.commons.compress.archivers.ar.ArArchiveEntry)",
      "begin_line": 98,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 24)",
        "(line 102,col 9)-(line 102,col 42)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 27)",
        "(line 108,col 9)-(line 108,col 39)",
        "(line 109,col 9)-(line 109,col 64)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 27)",
        "(line 115,col 9)-(line 115,col 39)",
        "(line 116,col 9)-(line 116,col 49)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 27)",
        "(line 122,col 9)-(line 122,col 39)",
        "(line 123,col 9)-(line 123,col 50)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 27)",
        "(line 129,col 9)-(line 129,col 39)",
        "(line 130,col 9)-(line 130,col 69)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 28)",
        "(line 136,col 9)-(line 136,col 39)",
        "(line 137,col 9)-(line 137,col 49)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 27)",
        "(line 143,col 9)-(line 143,col 39)",
        "(line 145,col 9)-(line 145,col 48)",
        "(line 147,col 9)-(line 147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 31)",
        "(line 152,col 9)-(line 152,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.close()",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 20)",
        "(line 157,col 9)-(line 157,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.finish()",
      "begin_line": 168,
      "end_line": 172,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.compress.archivers.ArchiveOutputStream#finish()\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)"
      ]
    }
  ]
}