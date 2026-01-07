{
  "filepath": "/tmp/Compress-4b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 51,
      "end_line": 152,
      "comment": "\n * Represents an archive entry in the \"ar\" format.\n * \n * Each AR archive starts with \"!\u003carch\u003e\" followed by a LF. After these 8 bytes\n * the archive entries are listed. The format of an entry header is as it follows:\n * \n * \u003cpre\u003e\n * START BYTE   END BYTE    NAME                    FORMAT      LENGTH\n * 0            15          File name               ASCII       16\n * 16           27          Modification timestamp  Decimal     12\n * 28           33          Owner ID                Decimal     6\n * 34           39          Group ID                Decimal     6\n * 40           47          File mode               Octal       8\n * 48           57          File size (bytes)       Decimal     10\n * 58           59          File magic              \\140\\012    2\n * \u003c/pre\u003e\n * \n * This specifies that an ar archive entry header contains 60 bytes.\n * \n * Due to the limitation of the file name length to 16 bytes GNU and BSD has\n * their own variants of this format. This formats are currently not supported\n * and file names with a bigger size than 16 bytes are not possible at the\n * moment.\n * \n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The header for each entry "
    },
    {
      "type": "field",
      "varNames": [
        "TRAILER"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The trailer for each entry "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * SVR4/GNU adds a trailing / to names; BSD does not.\n     * They also vary in how names longer than 16 characters are represented.\n     * (Not yet supported by this implementation)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MODE"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " \u003d (octal) 0100644 "
    },
    {
      "type": "field",
      "varNames": [
        "lastModified"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.ArArchiveEntry(java.lang.String, long)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 3)-(line 73,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.ArArchiveEntry(java.lang.String, long, int, int, int, long)",
      "begin_line": 76,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 77,col 3)-(line 77,col 19)",
        "(line 78,col 3)-(line 78,col 23)",
        "(line 79,col 3)-(line 79,col 23)",
        "(line 80,col 3)-(line 80,col 25)",
        "(line 81,col 3)-(line 81,col 19)",
        "(line 82,col 3)-(line 82,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.ArArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getSize()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 3)-(line 91,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getName()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 3)-(line 95,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getUserId()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 3)-(line 99,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getGroupId()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 3)-(line 103,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getMode()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 3)-(line 107,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getLastModified()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 3)-(line 111,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getLength()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 3)-(line 115,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.isDirectory()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 3)-(line 119,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.hashCode()",
      "begin_line": 125,
      "end_line": 130,
      "comment": " (non-Javadoc)\n     * @see java.lang.Object#hashCode()\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 29)",
        "(line 127,col 9)-(line 127,col 23)",
        "(line 128,col 9)-(line 128,col 73)",
        "(line 129,col 9)-(line 129,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.equals(java.lang.Object)",
      "begin_line": 135,
      "end_line": 151,
      "comment": " (non-Javadoc)\n     * @see java.lang.Object#equals(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 52)",
        "(line 143,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 20)"
      ]
    }
  ]
}