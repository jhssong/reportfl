{
  "filepath": "/tmp/Compress-34b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 34,
      "end_line": 234,
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
      "comment": "\n     * Set the long file mode.\n     * This can be LONGFILE_ERROR(0) or LONGFILE_BSD(1).\n     * This specifies the treatment of long file names (names \u0026gt;\u003d 16).\n     * Default is LONGFILE_ERROR.\n     * @param longFileMode the mode to use\n     * @since 1.3\n     ",
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
      "begin_line": 72,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 86,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 57)",
        "(line 93,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 29)",
        "(line 107,col 9)-(line 107,col 35)",
        "(line 109,col 9)-(line 109,col 24)",
        "(line 110,col 9)-(line 110,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.fill(long, long, char)",
      "begin_line": 113,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 47)",
        "(line 116,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 122,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(java.lang.String)",
      "begin_line": 125,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 52)",
        "(line 127,col 9)-(line 127,col 21)",
        "(line 128,col 9)-(line 128,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeEntryHeader(org.apache.commons.compress.archivers.ar.ArArchiveEntry)",
      "begin_line": 131,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 24)",
        "(line 134,col 9)-(line 134,col 39)",
        "(line 136,col 9)-(line 136,col 42)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 39)",
        "(line 150,col 9)-(line 150,col 55)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 27)",
        "(line 156,col 9)-(line 156,col 39)",
        "(line 157,col 9)-(line 157,col 49)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 27)",
        "(line 163,col 9)-(line 163,col 39)",
        "(line 164,col 9)-(line 164,col 50)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 27)",
        "(line 170,col 9)-(line 170,col 39)",
        "(line 171,col 9)-(line 171,col 69)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 28)",
        "(line 177,col 9)-(line 177,col 39)",
        "(line 178,col 9)-(line 180,col 64)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 27)",
        "(line 186,col 9)-(line 186,col 39)",
        "(line 188,col 9)-(line 188,col 48)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 194,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 197,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 31)",
        "(line 200,col 9)-(line 200,col 19)",
        "(line 201,col 9)-(line 201,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.close()",
      "begin_line": 207,
      "end_line": 214,
      "comment": "\n     * Calls finish if necessary, and then closes the OutputStream\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 20)",
        "(line 213,col 9)-(line 213,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 216,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.finish()",
      "begin_line": 225,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 24)"
      ]
    }
  ]
}