{
  "filepath": "/tmp/Compress-9b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 34,
      "end_line": 240,
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
        "archiveOffset"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevEntry"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "haveUnclosedEntry"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longFileMode"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " indicates if this archive is finished "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.ArArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.setLongFileMode(int)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Set the long file mode.\n     * This can be LONGFILE_ERROR(0) or LONGFILE_BSD(1).\n     * This specifies the treatment of long file names (names \u003e\u003d 16).\n     * Default is LONGFILE_ERROR.\n     * @param longFileMode the mode to use\n     * @since Apache Commons Compress 1.3\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeArchiveHeader()",
      "begin_line": 67,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 74)",
        "(line 69,col 9)-(line 69,col 26)",
        "(line 70,col 9)-(line 70,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 74,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 90,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 57)",
        "(line 97,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 29)",
        "(line 111,col 9)-(line 111,col 52)",
        "(line 113,col 9)-(line 113,col 24)",
        "(line 114,col 9)-(line 114,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.fill(long, long, char)",
      "begin_line": 117,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 47)",
        "(line 120,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(java.lang.String)",
      "begin_line": 129,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 52)",
        "(line 131,col 9)-(line 131,col 21)",
        "(line 132,col 9)-(line 132,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeEntryHeader(org.apache.commons.compress.archivers.ar.ArArchiveEntry)",
      "begin_line": 135,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 24)",
        "(line 138,col 9)-(line 138,col 39)",
        "(line 140,col 9)-(line 140,col 42)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 153,col 39)",
        "(line 154,col 9)-(line 154,col 57)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 27)",
        "(line 160,col 9)-(line 160,col 39)",
        "(line 161,col 9)-(line 161,col 49)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 27)",
        "(line 167,col 9)-(line 167,col 39)",
        "(line 168,col 9)-(line 168,col 50)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 27)",
        "(line 174,col 9)-(line 174,col 39)",
        "(line 175,col 9)-(line 175,col 69)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 28)",
        "(line 181,col 9)-(line 181,col 39)",
        "(line 182,col 9)-(line 184,col 64)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 27)",
        "(line 190,col 9)-(line 190,col 39)",
        "(line 192,col 9)-(line 192,col 48)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 201,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 31)",
        "(line 204,col 9)-(line 204,col 19)",
        "(line 205,col 9)-(line 205,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.close()",
      "begin_line": 211,
      "end_line": 218,
      "comment": "\n     * Calls finish if necessary, and then closes the OutputStream\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 20)",
        "(line 217,col 9)-(line 217,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 221,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.finish()",
      "begin_line": 231,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 24)"
      ]
    }
  ]
}