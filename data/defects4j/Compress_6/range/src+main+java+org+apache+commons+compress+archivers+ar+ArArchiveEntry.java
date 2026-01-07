{
  "filepath": "/tmp/Compress-6b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 52,
      "end_line": 186,
      "comment": "\n * Represents an archive entry in the \"ar\" format.\n * \n * Each AR archive starts with \"!\u003carch\u003e\" followed by a LF. After these 8 bytes\n * the archive entries are listed. The format of an entry header is as it follows:\n * \n * \u003cpre\u003e\n * START BYTE   END BYTE    NAME                    FORMAT      LENGTH\n * 0            15          File name               ASCII       16\n * 16           27          Modification timestamp  Decimal     12\n * 28           33          Owner ID                Decimal     6\n * 34           39          Group ID                Decimal     6\n * 40           47          File mode               Octal       8\n * 48           57          File size (bytes)       Decimal     10\n * 58           59          File magic              \\140\\012    2\n * \u003c/pre\u003e\n * \n * This specifies that an ar archive entry header contains 60 bytes.\n * \n * Due to the limitation of the file name length to 16 bytes GNU and BSD has\n * their own variants of this format. This formats are currently not supported\n * and file names with a bigger size than 16 bytes are not possible at the\n * moment.\n * \n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The header for each entry "
    },
    {
      "type": "field",
      "varNames": [
        "TRAILER"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The trailer for each entry "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * SVR4/GNU adds a trailing / to names; BSD does not.\n     * They also vary in how names longer than 16 characters are represented.\n     * (Not yet supported by this implementation)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MODE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " \u003d (octal) 0100644 "
    },
    {
      "type": "field",
      "varNames": [
        "lastModified"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.ArArchiveEntry(java.lang.String, long)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Create a new instance using a couple of default values.\n     *\n     * \u003cp\u003eSets userId and groupId to 0, the octal file mode to 644 and\n     * the last modified time to the current time.\u003c/p\u003e\n     *\n     * @param name name of the entry\n     * @param length length of the entry in bytes\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 84,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.ArArchiveEntry(java.lang.String, long, int, int, int, long)",
      "begin_line": 97,
      "end_line": 105,
      "comment": "\n     * Create a new instance.\n     *\n     * @param name name of the entry\n     * @param length length of the entry in bytes\n     * @param userId numeric user id\n     * @param groupId numeric group id\n     * @param mode file mode\n     * @param lastModified last modified time in seconds since the epoch\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 25)",
        "(line 100,col 9)-(line 100,col 29)",
        "(line 101,col 9)-(line 101,col 29)",
        "(line 102,col 9)-(line 102,col 31)",
        "(line 103,col 9)-(line 103,col 25)",
        "(line 104,col 9)-(line 104,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.ArArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "\n     * Create a new instance using the attributes of the given file\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 113,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getSize()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getName()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getUserId()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getGroupId()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getMode()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getLastModified()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Last modified time in seconds since the epoch.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getLastModifiedDate()",
      "begin_line": 144,
      "end_line": 146,
      "comment": " {@inheritDocs} ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getLength()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.isDirectory()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.hashCode()",
      "begin_line": 159,
      "end_line": 164,
      "comment": " (non-Javadoc)\n     * @see java.lang.Object#hashCode()\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 29)",
        "(line 161,col 9)-(line 161,col 23)",
        "(line 162,col 9)-(line 162,col 73)",
        "(line 163,col 9)-(line 163,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.equals(java.lang.Object)",
      "begin_line": 169,
      "end_line": 185,
      "comment": " (non-Javadoc)\n     * @see java.lang.Object#equals(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 52)",
        "(line 177,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 20)"
      ]
    }
  ]
}