{
  "filepath": "/tmp/Compress-17b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.tar.TarConstants",
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 116,
      "end_line": 1070,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The entry\u0027s name. "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The entry\u0027s permission mode. "
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The entry\u0027s user id. "
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The entry\u0027s group id. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The entry\u0027s size. "
    },
    {
      "type": "field",
      "varNames": [
        "modTime"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The entry\u0027s modification time. "
    },
    {
      "type": "field",
      "varNames": [
        "checkSumOK"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " If the header checksum is reasonably correct. "
    },
    {
      "type": "field",
      "varNames": [
        "linkFlag"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The entry\u0027s link flag. "
    },
    {
      "type": "field",
      "varNames": [
        "linkName"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The entry\u0027s link name. "
    },
    {
      "type": "field",
      "varNames": [
        "magic"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The entry\u0027s magic tag. "
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " The version of the format "
    },
    {
      "type": "field",
      "varNames": [
        "userName"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " The entry\u0027s user name. "
    },
    {
      "type": "field",
      "varNames": [
        "groupName"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " The entry\u0027s group name. "
    },
    {
      "type": "field",
      "varNames": [
        "devMajor"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The entry\u0027s major device number. "
    },
    {
      "type": "field",
      "varNames": [
        "devMinor"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " The entry\u0027s minor device number. "
    },
    {
      "type": "field",
      "varNames": [
        "isExtended"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " If an extension sparse header follows. "
    },
    {
      "type": "field",
      "varNames": [
        "realSize"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " The entry\u0027s real size in case of a sparse file. "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " The entry\u0027s file reference "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_NAMELEN"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " Maximum length of a user\u0027s name in the tar file "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIR_MODE"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " Default permissions bits for directories "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FILE_MODE"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " Default permissions bits for files "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " Convert millis to seconds "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry()",
      "begin_line": 185,
      "end_line": 202,
      "comment": "\n     * Construct an empty entry and prepares the header values.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 33)",
        "(line 187,col 9)-(line 187,col 37)",
        "(line 188,col 9)-(line 188,col 23)",
        "(line 189,col 9)-(line 189,col 27)",
        "(line 191,col 9)-(line 191,col 58)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 24)",
        "(line 198,col 9)-(line 198,col 25)",
        "(line 199,col 9)-(line 199,col 29)",
        "(line 200,col 9)-(line 200,col 28)",
        "(line 201,col 9)-(line 201,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, boolean)",
      "begin_line": 224,
      "end_line": 242,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     * @param preserveLeadingSlashes whether to allow leading slashes\n     * in the name.\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 15)",
        "(line 227,col 9)-(line 227,col 63)",
        "(line 228,col 9)-(line 228,col 43)",
        "(line 230,col 9)-(line 230,col 26)",
        "(line 231,col 9)-(line 231,col 26)",
        "(line 232,col 9)-(line 232,col 25)",
        "(line 233,col 9)-(line 233,col 65)",
        "(line 234,col 9)-(line 234,col 51)",
        "(line 235,col 9)-(line 235,col 24)",
        "(line 236,col 9)-(line 236,col 25)",
        "(line 237,col 9)-(line 237,col 22)",
        "(line 238,col 9)-(line 238,col 66)",
        "(line 239,col 9)-(line 239,col 27)",
        "(line 240,col 9)-(line 240,col 27)",
        "(line 241,col 9)-(line 241,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte)",
      "begin_line": 250,
      "end_line": 257,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 19)",
        "(line 252,col 9)-(line 252,col 33)",
        "(line 253,col 9)-(line 256,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     * The name is set from the normalized file path.\n     *\n     * @param file The file that the entry represents.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 277,
      "end_line": 305,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     *\n     * @param file The file that the entry represents.\n     * @param fileName the name to be used for the entry.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 15)",
        "(line 280,col 9)-(line 280,col 25)",
        "(line 282,col 9)-(line 282,col 27)",
        "(line 284,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 302,col 63)",
        "(line 303,col 9)-(line 303,col 26)",
        "(line 304,col 9)-(line 304,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[])",
      "begin_line": 314,
      "end_line": 317,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 15)",
        "(line 316,col 9)-(line 316,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 328,
      "end_line": 332,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     * @param encoding encoding to use for file names\n     * @since Commons Compress 1.4\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 15)",
        "(line 331,col 9)-(line 331,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(java.lang.Object)",
      "begin_line": 352,
      "end_line": 358,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode()",
      "begin_line": 365,
      "end_line": 368,
      "comment": "\n     * Hashcodes are based on entry names.\n     *\n     * @return the entry hashcode\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 378,
      "end_line": 380,
      "comment": "\n     * Determine if the given entry is a descendant of this entry.\n     * Descendancy is determined by the name of the descendant\n     * starting with this entry\u0027s name.\n     *\n     * @param desc Entry to be checked as a descendent of this.\n     * @return True if entry is a descendant of this.\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getName()",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(java.lang.String)",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setMode(int)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\n     * Set the mode for this entry\n     *\n     * @param mode the mode for this entry\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLinkName()",
      "begin_line": 414,
      "end_line": 416,
      "comment": "\n     * Get this entry\u0027s link name.\n     *\n     * @return This entry\u0027s link name.\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setLinkName(java.lang.String)",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\n     * Set this entry\u0027s link name.\n     * \n     * @param link the link name to use.\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserId()",
      "begin_line": 434,
      "end_line": 436,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(int)",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupId()",
      "begin_line": 452,
      "end_line": 454,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @return This entry\u0027s group id.\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(int)",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserName()",
      "begin_line": 470,
      "end_line": 472,
      "comment": "\n     * Get this entry\u0027s user name.\n     *\n     * @return This entry\u0027s user name.\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserName(java.lang.String)",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\n     * Set this entry\u0027s user name.\n     *\n     * @param userName This entry\u0027s new user name.\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupName()",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\n     * Get this entry\u0027s group name.\n     *\n     * @return This entry\u0027s group name.\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupName(java.lang.String)",
      "begin_line": 497,
      "end_line": 499,
      "comment": "\n     * Set this entry\u0027s group name.\n     *\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setIds(int, int)",
      "begin_line": 507,
      "end_line": 510,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user ids.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 26)",
        "(line 509,col 9)-(line 509,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setNames(java.lang.String, java.lang.String)",
      "begin_line": 518,
      "end_line": 521,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user names.\n     *\n     * @param userName This entry\u0027s new user name.\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 30)",
        "(line 520,col 9)-(line 520,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(long)",
      "begin_line": 529,
      "end_line": 531,
      "comment": "\n     * Set this entry\u0027s modification time. The parameter passed\n     * to this method is in \"Java time\".\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(java.util.Date)",
      "begin_line": 538,
      "end_line": 540,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getModTime()",
      "begin_line": 547,
      "end_line": 549,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @return time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLastModifiedDate()",
      "begin_line": 552,
      "end_line": 554,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isCheckSumOK()",
      "begin_line": 563,
      "end_line": 565,
      "comment": "\n     * Get this entry\u0027s checksum status.\n     *\n     * @return if the header checksum is reasonably correct\n     * @see TarUtils#verifyCheckSum(byte[])\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getFile()",
      "begin_line": 572,
      "end_line": 574,
      "comment": "\n     * Get this entry\u0027s file.\n     *\n     * @return This entry\u0027s file.\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getMode()",
      "begin_line": 581,
      "end_line": 583,
      "comment": "\n     * Get this entry\u0027s mode.\n     *\n     * @return This entry\u0027s mode.\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getSize()",
      "begin_line": 590,
      "end_line": 592,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setSize(long)",
      "begin_line": 600,
      "end_line": 605,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     * @throws IllegalArgumentException if the size is \u0026lt; 0.\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 604,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDevMajor()",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\n     * Get this entry\u0027s major device number.\n     *\n     * @return This entry\u0027s major device number.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setDevMajor(int)",
      "begin_line": 624,
      "end_line": 630,
      "comment": "\n     * Set this entry\u0027s major device number.\n     *\n     * @param devNo This entry\u0027s major device number.\n     * @throws IllegalArgumentException if the devNo is \u0026lt; 0.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDevMinor()",
      "begin_line": 638,
      "end_line": 640,
      "comment": "\n     * Get this entry\u0027s minor device number.\n     *\n     * @return This entry\u0027s minor device number.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setDevMinor(int)",
      "begin_line": 649,
      "end_line": 655,
      "comment": "\n     * Set this entry\u0027s minor device number.\n     *\n     * @param devNo This entry\u0027s minor device number.\n     * @throws IllegalArgumentException if the devNo is \u0026lt; 0.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 653,col 9)",
        "(line 654,col 9)-(line 654,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isExtended()",
      "begin_line": 663,
      "end_line": 665,
      "comment": "\n     * Indicates in case of a sparse file if an extension sparse header\n     * follows.\n     *\n     * @return true if an extension sparse header follows.\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getRealSize()",
      "begin_line": 672,
      "end_line": 674,
      "comment": "\n     * Get this entry\u0027s real file size in case of a sparse file.\n     *\n     * @return This entry\u0027s real file size.\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNUSparse()",
      "begin_line": 681,
      "end_line": 683,
      "comment": "\n     * Indicate if this entry is a GNU sparse block \n     *\n     * @return true if this is a sparse extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongNameEntry()",
      "begin_line": 690,
      "end_line": 693,
      "comment": "\n     * Indicate if this entry is a GNU long name block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 692,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isPaxHeader()",
      "begin_line": 703,
      "end_line": 706,
      "comment": "\n     * Check if this is a Pax header.\n     * \n     * @return {@code true} if this is a Pax header.\n     * \n     * @since 1.1\n     * \n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 705,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGlobalPaxHeader()",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\n     * Check if this is a Pax header.\n     * \n     * @return {@code true} if this is a Pax header.\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory()",
      "begin_line": 724,
      "end_line": 738,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 727,col 9)",
        "(line 729,col 9)-(line 731,col 9)",
        "(line 733,col 9)-(line 735,col 9)",
        "(line 737,col 9)-(line 737,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFile()",
      "begin_line": 745,
      "end_line": 753,
      "comment": "\n     * Check if this is a \"normal file\"\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 752,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isSymbolicLink()",
      "begin_line": 760,
      "end_line": 762,
      "comment": "\n     * Check if this is a symbolic link entry.\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isLink()",
      "begin_line": 769,
      "end_line": 771,
      "comment": "\n     * Check if this is a link entry.\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isCharacterDevice()",
      "begin_line": 778,
      "end_line": 780,
      "comment": "\n     * Check if this is a character device entry.\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isBlockDevice()",
      "begin_line": 787,
      "end_line": 789,
      "comment": "\n     * Check if this is a block device entry.\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFIFO()",
      "begin_line": 796,
      "end_line": 798,
      "comment": "\n     * Check if this is a FIFO (pipe) entry.\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries()",
      "begin_line": 806,
      "end_line": 819,
      "comment": "\n     * If this entry represents a file, and the file is a directory, return\n     * an array of TarEntries for this entry\u0027s children.\n     *\n     * @return An array of TarEntry\u0027s for this entry\u0027s children.\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 809,col 9)",
        "(line 811,col 9)-(line 811,col 38)",
        "(line 812,col 9)-(line 812,col 68)",
        "(line 814,col 9)-(line 816,col 9)",
        "(line 818,col 9)-(line 818,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[])",
      "begin_line": 828,
      "end_line": 839,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * \u003cp\u003eThis method does not use the star/GNU tar/BSD tar extensions.\u003c/p\u003e\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 838,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding, boolean)",
      "begin_line": 851,
      "end_line": 893,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     * @param encoding encoding to use when writing the file name.\n     * @param starMode whether to use the star/GNU tar/BSD tar\n     * extension for numeric fields if their value doesn\u0027t fit in the\n     * maximum size of standard tar archives\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 23)",
        "(line 855,col 9)-(line 856,col 52)",
        "(line 857,col 9)-(line 857,col 80)",
        "(line 858,col 9)-(line 859,col 49)",
        "(line 860,col 9)-(line 861,col 49)",
        "(line 862,col 9)-(line 862,col 80)",
        "(line 863,col 9)-(line 864,col 49)",
        "(line 866,col 9)-(line 866,col 30)",
        "(line 868,col 9)-(line 870,col 9)",
        "(line 872,col 9)-(line 872,col 36)",
        "(line 873,col 9)-(line 874,col 52)",
        "(line 875,col 9)-(line 875,col 75)",
        "(line 876,col 9)-(line 876,col 79)",
        "(line 877,col 9)-(line 878,col 52)",
        "(line 879,col 9)-(line 880,col 52)",
        "(line 881,col 9)-(line 882,col 49)",
        "(line 883,col 9)-(line 884,col 49)",
        "(line 886,col 9)-(line 888,col 9)",
        "(line 890,col 9)-(line 890,col 52)",
        "(line 892,col 9)-(line 892,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(long, byte[], int, int, boolean)",
      "begin_line": 895,
      "end_line": 906,
      "comment": "",
      "child_ranges": [
        "(line 897,col 9)-(line 903,col 9)",
        "(line 904,col 9)-(line 905,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[])",
      "begin_line": 914,
      "end_line": 925,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 924,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 936,
      "end_line": 939,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     * @param encoding encoding to use for file names\n     * @since Commons Compress 1.4\n     * @throws IllegalArgumentException if any of the numeric fields\n     * have an invalid format\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding, boolean)",
      "begin_line": 941,
      "end_line": 1010,
      "comment": "",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 23)",
        "(line 946,col 9)-(line 947,col 68)",
        "(line 948,col 9)-(line 948,col 26)",
        "(line 949,col 9)-(line 949,col 74)",
        "(line 950,col 9)-(line 950,col 26)",
        "(line 951,col 9)-(line 951,col 75)",
        "(line 952,col 9)-(line 952,col 25)",
        "(line 953,col 9)-(line 953,col 76)",
        "(line 954,col 9)-(line 954,col 25)",
        "(line 955,col 9)-(line 955,col 68)",
        "(line 956,col 9)-(line 956,col 26)",
        "(line 957,col 9)-(line 957,col 74)",
        "(line 958,col 9)-(line 958,col 29)",
        "(line 959,col 9)-(line 959,col 53)",
        "(line 960,col 9)-(line 960,col 28)",
        "(line 961,col 9)-(line 961,col 36)",
        "(line 962,col 9)-(line 963,col 68)",
        "(line 964,col 9)-(line 964,col 26)",
        "(line 965,col 9)-(line 965,col 61)",
        "(line 966,col 9)-(line 966,col 27)",
        "(line 967,col 9)-(line 967,col 65)",
        "(line 968,col 9)-(line 968,col 29)",
        "(line 969,col 9)-(line 970,col 69)",
        "(line 971,col 9)-(line 971,col 27)",
        "(line 972,col 9)-(line 973,col 69)",
        "(line 974,col 9)-(line 974,col 27)",
        "(line 975,col 9)-(line 975,col 77)",
        "(line 976,col 9)-(line 976,col 25)",
        "(line 977,col 9)-(line 977,col 77)",
        "(line 978,col 9)-(line 978,col 25)",
        "(line 980,col 9)-(line 980,col 40)",
        "(line 981,col 9)-(line 1009,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(java.lang.String, boolean)",
      "begin_line": 1016,
      "end_line": 1053,
      "comment": "\n     * Strips Windows\u0027 drive letter as well as any leading slashes,\n     * turns path separators into forward slahes.\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 82)",
        "(line 1020,col 9)-(line 1042,col 9)",
        "(line 1044,col 9)-(line 1044,col 61)",
        "(line 1049,col 9)-(line 1051,col 9)",
        "(line 1052,col 9)-(line 1052,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.evaluateType(byte[])",
      "begin_line": 1061,
      "end_line": 1069,
      "comment": "\n     * Evaluate an entry\u0027s header format from a header buffer.\n     *\n     * @param header The tar entry header buffer to evaluate the format for.\n     * @return format type\n     ",
      "child_ranges": [
        "(line 1062,col 9)-(line 1064,col 9)",
        "(line 1065,col 9)-(line 1067,col 9)",
        "(line 1068,col 9)-(line 1068,col 17)"
      ]
    }
  ]
}