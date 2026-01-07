{
  "filepath": "/tmp/Compress-17b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 34,
      "end_line": 238,
      "comment": "\n * Implements the \"ar\" archive format as an output stream.\n * \n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_ERROR"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Fail if a long file name is required in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_BSD"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " BSD ar extensions are used to store long file names in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevEntry"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "haveUnclosedEntry"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longFileMode"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " indicates if this archive is finished "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.ArArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.setLongFileMode(int)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Set the long file mode.\n     * This can be LONGFILE_ERROR(0) or LONGFILE_BSD(1).\n     * This specifies the treatment of long file names (names \u003e\u003d 16).\n     * Default is LONGFILE_ERROR.\n     * @param longFileMode the mode to use\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeArchiveHeader()",
      "begin_line": 66,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 74)",
        "(line 68,col 9)-(line 68,col 26)",
        "(line 69,col 9)-(line 69,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 73,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 88,
      "end_line": 113,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 57)",
        "(line 95,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 29)",
        "(line 109,col 9)-(line 109,col 35)",
        "(line 111,col 9)-(line 111,col 24)",
        "(line 112,col 9)-(line 112,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.fill(long, long, char)",
      "begin_line": 115,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 47)",
        "(line 118,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(java.lang.String)",
      "begin_line": 127,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 52)",
        "(line 129,col 9)-(line 129,col 21)",
        "(line 130,col 9)-(line 130,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeEntryHeader(org.apache.commons.compress.archivers.ar.ArArchiveEntry)",
      "begin_line": 133,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 24)",
        "(line 136,col 9)-(line 136,col 39)",
        "(line 138,col 9)-(line 138,col 42)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 39)",
        "(line 152,col 9)-(line 152,col 57)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 27)",
        "(line 158,col 9)-(line 158,col 39)",
        "(line 159,col 9)-(line 159,col 49)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 27)",
        "(line 165,col 9)-(line 165,col 39)",
        "(line 166,col 9)-(line 166,col 50)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 27)",
        "(line 172,col 9)-(line 172,col 39)",
        "(line 173,col 9)-(line 173,col 69)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 28)",
        "(line 179,col 9)-(line 179,col 39)",
        "(line 180,col 9)-(line 182,col 64)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 27)",
        "(line 188,col 9)-(line 188,col 39)",
        "(line 190,col 9)-(line 190,col 48)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 199,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 31)",
        "(line 202,col 9)-(line 202,col 19)",
        "(line 203,col 9)-(line 203,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.close()",
      "begin_line": 209,
      "end_line": 216,
      "comment": "\n     * Calls finish if necessary, and then closes the OutputStream\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 20)",
        "(line 215,col 9)-(line 215,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 219,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.finish()",
      "begin_line": 229,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 24)"
      ]
    }
  ]
}