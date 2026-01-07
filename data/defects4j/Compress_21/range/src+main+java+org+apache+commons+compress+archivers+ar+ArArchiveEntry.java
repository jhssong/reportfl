{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 54,
      "end_line": 183,
      "comment": "\n * Represents an archive entry in the \"ar\" format.\n * \n * Each AR archive starts with \"!\u003carch\u003e\" followed by a LF. After these 8 bytes\n * the archive entries are listed. The format of an entry header is as it follows:\n * \n * \u003cpre\u003e\n * START BYTE   END BYTE    NAME                    FORMAT      LENGTH\n * 0            15          File name               ASCII       16\n * 16           27          Modification timestamp  Decimal     12\n * 28           33          Owner ID                Decimal     6\n * 34           39          Group ID                Decimal     6\n * 40           47          File mode               Octal       8\n * 48           57          File size (bytes)       Decimal     10\n * 58           59          File magic              \\140\\012    2\n * \u003c/pre\u003e\n * \n * This specifies that an ar archive entry header contains 60 bytes.\n * \n * Due to the limitation of the file name length to 16 bytes GNU and\n * BSD has their own variants of this format. Currently Commons\n * Compress can read but not write the GNU variant.  It fully supports\n * the BSD variant.\n * \n * @see \u003ca href\u003d\"http://www.freebsd.org/cgi/man.cgi?query\u003dar\u0026sektion\u003d5\"\u003ear man page\u003c/a\u003e\n *\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The header for each entry "
    },
    {
      "type": "field",
      "varNames": [
        "TRAILER"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The trailer for each entry "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * SVR4/GNU adds a trailing / to names; BSD does not.\n     * They also vary in how names longer than 16 characters are represented.\n     * (Not yet fully supported by this implementation)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MODE"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " \u003d (octal) 0100644 "
    },
    {
      "type": "field",
      "varNames": [
        "lastModified"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.ArArchiveEntry(java.lang.String, long)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Create a new instance using a couple of default values.\n     *\n     * \u003cp\u003eSets userId and groupId to 0, the octal file mode to 644 and\n     * the last modified time to the current time.\u003c/p\u003e\n     *\n     * @param name name of the entry\n     * @param length length of the entry in bytes\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 86,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.ArArchiveEntry(java.lang.String, long, int, int, int, long)",
      "begin_line": 99,
      "end_line": 107,
      "comment": "\n     * Create a new instance.\n     *\n     * @param name name of the entry\n     * @param length length of the entry in bytes\n     * @param userId numeric user id\n     * @param groupId numeric group id\n     * @param mode file mode\n     * @param lastModified last modified time in seconds since the epoch\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 25)",
        "(line 102,col 9)-(line 102,col 29)",
        "(line 103,col 9)-(line 103,col 29)",
        "(line 104,col 9)-(line 104,col 31)",
        "(line 105,col 9)-(line 105,col 25)",
        "(line 106,col 9)-(line 106,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.ArArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 112,
      "end_line": 116,
      "comment": "\n     * Create a new instance using the attributes of the given file\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 115,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getSize()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getName()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getUserId()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getGroupId()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getMode()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getLastModified()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Last modified time in seconds since the epoch.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getLastModifiedDate()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getLength()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.isDirectory()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.hashCode()",
      "begin_line": 157,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 29)",
        "(line 160,col 9)-(line 160,col 23)",
        "(line 161,col 9)-(line 161,col 73)",
        "(line 162,col 9)-(line 162,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.equals(java.lang.Object)",
      "begin_line": 165,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 52)",
        "(line 174,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 20)"
      ]
    }
  ]
}