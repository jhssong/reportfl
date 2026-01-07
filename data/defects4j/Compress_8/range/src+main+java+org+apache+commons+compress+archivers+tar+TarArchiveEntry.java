{
  "filepath": "/tmp/Compress-8b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.tar.TarConstants",
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 84,
      "end_line": 744,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The entry\u0027s name. "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The entry\u0027s permission mode. "
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The entry\u0027s user id. "
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The entry\u0027s group id. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The entry\u0027s size. "
    },
    {
      "type": "field",
      "varNames": [
        "modTime"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The entry\u0027s modification time. "
    },
    {
      "type": "field",
      "varNames": [
        "linkFlag"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " The entry\u0027s link flag. "
    },
    {
      "type": "field",
      "varNames": [
        "linkName"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The entry\u0027s link name. "
    },
    {
      "type": "field",
      "varNames": [
        "magic"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " The entry\u0027s magic tag. "
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The version of the format "
    },
    {
      "type": "field",
      "varNames": [
        "userName"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The entry\u0027s user name. "
    },
    {
      "type": "field",
      "varNames": [
        "groupName"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The entry\u0027s group name. "
    },
    {
      "type": "field",
      "varNames": [
        "devMajor"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The entry\u0027s major device number. "
    },
    {
      "type": "field",
      "varNames": [
        "devMinor"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The entry\u0027s minor device number. "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The entry\u0027s file reference "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_NAMELEN"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Maximum length of a user\u0027s name in the tar file "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIR_MODE"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Default permissions bits for directories "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FILE_MODE"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Default permissions bits for files "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Convert millis to seconds "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry()",
      "begin_line": 144,
      "end_line": 161,
      "comment": "\n     * Construct an empty entry and prepares the header values.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 33)",
        "(line 146,col 9)-(line 146,col 37)",
        "(line 147,col 9)-(line 147,col 23)",
        "(line 148,col 9)-(line 148,col 27)",
        "(line 150,col 9)-(line 150,col 58)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 156,col 24)",
        "(line 157,col 9)-(line 157,col 25)",
        "(line 158,col 9)-(line 158,col 29)",
        "(line 159,col 9)-(line 159,col 28)",
        "(line 160,col 9)-(line 160,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, boolean)",
      "begin_line": 183,
      "end_line": 204,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     * @param preserveLeadingSlashes whether to allow leading slashes\n     * in the name.\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 15)",
        "(line 186,col 9)-(line 186,col 63)",
        "(line 187,col 9)-(line 187,col 43)",
        "(line 189,col 9)-(line 189,col 26)",
        "(line 190,col 9)-(line 190,col 26)",
        "(line 191,col 9)-(line 191,col 25)",
        "(line 192,col 9)-(line 192,col 65)",
        "(line 193,col 9)-(line 193,col 51)",
        "(line 194,col 9)-(line 194,col 24)",
        "(line 195,col 9)-(line 195,col 25)",
        "(line 196,col 9)-(line 196,col 22)",
        "(line 197,col 9)-(line 197,col 66)",
        "(line 198,col 9)-(line 198,col 27)",
        "(line 199,col 9)-(line 199,col 27)",
        "(line 200,col 9)-(line 200,col 28)",
        "(line 201,col 9)-(line 201,col 26)",
        "(line 202,col 9)-(line 202,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte)",
      "begin_line": 212,
      "end_line": 219,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 19)",
        "(line 214,col 9)-(line 214,col 33)",
        "(line 215,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     * The name is set from the normalized file path.\n     *\n     * @param file The file that the entry represents.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 239,
      "end_line": 267,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     *\n     * @param file The file that the entry represents.\n     * @param fileName the name to be used for the entry.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 15)",
        "(line 242,col 9)-(line 242,col 25)",
        "(line 244,col 9)-(line 244,col 27)",
        "(line 246,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 264,col 63)",
        "(line 265,col 9)-(line 265,col 26)",
        "(line 266,col 9)-(line 266,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[])",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 15)",
        "(line 277,col 9)-(line 277,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(java.lang.Object)",
      "begin_line": 298,
      "end_line": 303,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\n     * Hashcodes are based on entry names.\n     *\n     * @return the entry hashcode\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Determine if the given entry is a descendant of this entry.\n     * Descendancy is determined by the name of the descendant\n     * starting with this entry\u0027s name.\n     *\n     * @param desc Entry to be checked as a descendent of this.\n     * @return True if entry is a descendant of this.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getName()",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(java.lang.String)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setMode(int)",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n     * Set the mode for this entry\n     *\n     * @param mode the mode for this entry\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLinkName()",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\n     * Get this entry\u0027s link name.\n     *\n     * @return This entry\u0027s link name.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setLinkName(java.lang.String)",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\n     * Set this entry\u0027s link name.\n     * \n     * @param link the link name to use.\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserId()",
      "begin_line": 378,
      "end_line": 380,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(int)",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupId()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @return This entry\u0027s group id.\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(int)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserName()",
      "begin_line": 414,
      "end_line": 416,
      "comment": "\n     * Get this entry\u0027s user name.\n     *\n     * @return This entry\u0027s user name.\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserName(java.lang.String)",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\n     * Set this entry\u0027s user name.\n     *\n     * @param userName This entry\u0027s new user name.\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupName()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\n     * Get this entry\u0027s group name.\n     *\n     * @return This entry\u0027s group name.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupName(java.lang.String)",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n     * Set this entry\u0027s group name.\n     *\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setIds(int, int)",
      "begin_line": 451,
      "end_line": 454,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user ids.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 26)",
        "(line 453,col 9)-(line 453,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setNames(java.lang.String, java.lang.String)",
      "begin_line": 462,
      "end_line": 465,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user names.\n     *\n     * @param userName This entry\u0027s new user name.\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 30)",
        "(line 464,col 9)-(line 464,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(long)",
      "begin_line": 473,
      "end_line": 475,
      "comment": "\n     * Set this entry\u0027s modification time. The parameter passed\n     * to this method is in \"Java time\".\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(java.util.Date)",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getModTime()",
      "begin_line": 491,
      "end_line": 493,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @return time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLastModifiedDate()",
      "begin_line": 496,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getFile()",
      "begin_line": 505,
      "end_line": 507,
      "comment": "\n     * Get this entry\u0027s file.\n     *\n     * @return This entry\u0027s file.\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getMode()",
      "begin_line": 514,
      "end_line": 516,
      "comment": "\n     * Get this entry\u0027s mode.\n     *\n     * @return This entry\u0027s mode.\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getSize()",
      "begin_line": 523,
      "end_line": 525,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setSize(long)",
      "begin_line": 534,
      "end_line": 539,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     * @throws IllegalArgumentException if the size is \u003c 0\n     * or \u003e {@link TarConstants#MAXSIZE} (077777777777L).\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongNameEntry()",
      "begin_line": 547,
      "end_line": 550,
      "comment": "\n     * Indicate if this entry is a GNU long name block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 549,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isPaxHeader()",
      "begin_line": 559,
      "end_line": 562,
      "comment": "\n     * Check if this is a Pax header.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if this is a Pax header.\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 561,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGlobalPaxHeader()",
      "begin_line": 571,
      "end_line": 573,
      "comment": "\n     * Check if this is a Pax header.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if this is a Pax header.\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory()",
      "begin_line": 580,
      "end_line": 594,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 583,col 9)",
        "(line 585,col 9)-(line 587,col 9)",
        "(line 589,col 9)-(line 591,col 9)",
        "(line 593,col 9)-(line 593,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries()",
      "begin_line": 602,
      "end_line": 615,
      "comment": "\n     * If this entry represents a file, and the file is a directory, return\n     * an array of TarEntries for this entry\u0027s children.\n     *\n     * @return An array of TarEntry\u0027s for this entry\u0027s children.\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 605,col 9)",
        "(line 607,col 9)-(line 607,col 38)",
        "(line 608,col 9)-(line 608,col 68)",
        "(line 610,col 9)-(line 612,col 9)",
        "(line 614,col 9)-(line 614,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[])",
      "begin_line": 622,
      "end_line": 654,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 23)",
        "(line 625,col 9)-(line 625,col 73)",
        "(line 626,col 9)-(line 626,col 74)",
        "(line 627,col 9)-(line 627,col 75)",
        "(line 628,col 9)-(line 628,col 76)",
        "(line 629,col 9)-(line 629,col 78)",
        "(line 630,col 9)-(line 630,col 84)",
        "(line 632,col 9)-(line 632,col 30)",
        "(line 634,col 9)-(line 636,col 9)",
        "(line 638,col 9)-(line 638,col 36)",
        "(line 639,col 9)-(line 639,col 77)",
        "(line 640,col 9)-(line 640,col 75)",
        "(line 641,col 9)-(line 641,col 79)",
        "(line 642,col 9)-(line 642,col 78)",
        "(line 643,col 9)-(line 643,col 79)",
        "(line 644,col 9)-(line 644,col 77)",
        "(line 645,col 9)-(line 645,col 77)",
        "(line 647,col 9)-(line 649,col 9)",
        "(line 651,col 9)-(line 651,col 52)",
        "(line 653,col 9)-(line 653,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[])",
      "begin_line": 661,
      "end_line": 700,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 23)",
        "(line 664,col 9)-(line 664,col 59)",
        "(line 665,col 9)-(line 665,col 26)",
        "(line 666,col 9)-(line 666,col 66)",
        "(line 667,col 9)-(line 667,col 26)",
        "(line 668,col 9)-(line 668,col 67)",
        "(line 669,col 9)-(line 669,col 25)",
        "(line 670,col 9)-(line 670,col 68)",
        "(line 671,col 9)-(line 671,col 25)",
        "(line 672,col 9)-(line 672,col 60)",
        "(line 673,col 9)-(line 673,col 26)",
        "(line 674,col 9)-(line 674,col 66)",
        "(line 675,col 9)-(line 675,col 29)",
        "(line 676,col 9)-(line 676,col 28)",
        "(line 677,col 9)-(line 677,col 36)",
        "(line 678,col 9)-(line 678,col 63)",
        "(line 679,col 9)-(line 679,col 26)",
        "(line 680,col 9)-(line 680,col 61)",
        "(line 681,col 9)-(line 681,col 27)",
        "(line 682,col 9)-(line 682,col 65)",
        "(line 683,col 9)-(line 683,col 29)",
        "(line 684,col 9)-(line 684,col 64)",
        "(line 685,col 9)-(line 685,col 27)",
        "(line 686,col 9)-(line 686,col 65)",
        "(line 687,col 9)-(line 687,col 27)",
        "(line 688,col 9)-(line 688,col 69)",
        "(line 689,col 9)-(line 689,col 25)",
        "(line 690,col 9)-(line 690,col 69)",
        "(line 691,col 9)-(line 691,col 25)",
        "(line 692,col 9)-(line 692,col 70)",
        "(line 694,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 699,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(java.lang.String, boolean)",
      "begin_line": 706,
      "end_line": 743,
      "comment": "\n     * Strips Windows\u0027 drive letter as well as any leading slashes,\n     * turns path separators into forward slahes.\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 82)",
        "(line 710,col 9)-(line 732,col 9)",
        "(line 734,col 9)-(line 734,col 61)",
        "(line 739,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 24)"
      ]
    }
  ]
}