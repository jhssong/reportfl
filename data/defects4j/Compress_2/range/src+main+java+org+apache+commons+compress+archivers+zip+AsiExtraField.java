{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/zip/AsiExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AsiExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField",
        "org.apache.commons.compress.archivers.zip.UnixStat",
        "java.lang.Cloneable"
      ],
      "begin_line": 49,
      "end_line": 325,
      "comment": "\n * Adds Unix file permission and UID/GID fields as well as symbolic\n * link handling.\n *\n * \u003cp\u003eThis class uses the ASi extra field in the format:\n * \u003cpre\u003e\n *         Value         Size            Description\n *         -----         ----            -----------\n * (Unix3) 0x756e        Short           tag for this extra block type\n *         TSize         Short           total data size for this block\n *         CRC           Long            CRC-32 of the remaining data\n *         Mode          Short           file permissions\n *         SizDev        Long            symlink\u0027d size OR major/minor dev num\n *         UID           Short           user ID\n *         GID           Short           group ID\n *         (var.)        variable        symbolic link filename\n * \u003c/pre\u003e\n * taken from appnote.iz (Info-ZIP note, 981119) found at \u003ca\n * href\u003d\"ftp://ftp.uu.net/pub/archiving/zip/doc/\"\u003eftp://ftp.uu.net/pub/archiving/zip/doc/\u003c/a\u003e\u003c/p\u003e\n\n *\n * \u003cp\u003eShort is two bytes and Long is four bytes in big endian byte and\n * word order, device numbers are currently not supported.\u003c/p\u003e\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Standard Unix stat(2) file mode.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "uid"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * User ID.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "gid"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Group ID.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "link"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * File this entry points to, if it is a symbolic link.\n     *\n     * \u003cp\u003eempty string - if entry is not a symbolic link.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dirFlag"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Is this an entry for a directory?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Instance used to calculate checksums.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.AsiExtraField()",
      "begin_line": 82,
      "end_line": 83,
      "comment": " Constructor for AsiExtraField. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getHeaderId()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * The Header-ID.\n     * @return the value for the header id for this extrafield\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getLocalFileDataLength()",
      "begin_line": 98,
      "end_line": 105,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 104,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getCentralDirectoryLength()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Delegate to local file data.\n     * @return the centralDirectory length\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getLocalFileDataData()",
      "begin_line": 120,
      "end_line": 146,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     * @return get the data\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 75)",
        "(line 123,col 9)-(line 123,col 70)",
        "(line 125,col 9)-(line 125,col 54)",
        "(line 127,col 9)-(line 128,col 43)",
        "(line 130,col 9)-(line 131,col 40)",
        "(line 132,col 9)-(line 133,col 40)",
        "(line 135,col 9)-(line 135,col 67)",
        "(line 138,col 9)-(line 138,col 20)",
        "(line 139,col 9)-(line 139,col 25)",
        "(line 140,col 9)-(line 140,col 39)",
        "(line 142,col 9)-(line 142,col 53)",
        "(line 143,col 9)-(line 143,col 73)",
        "(line 144,col 9)-(line 144,col 61)",
        "(line 145,col 9)-(line 145,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getCentralDirectoryData()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Delegate to local file data.\n     * @return the local file data\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setUserId(int)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Set the user id.\n     * @param uid the user id\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getUserId()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Get the user id.\n     * @return the user id\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setGroupId(int)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Set the group id.\n     * @param gid the group id\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getGroupId()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Get the group id.\n     * @return the group id\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setLinkedFile(java.lang.String)",
      "begin_line": 194,
      "end_line": 197,
      "comment": "\n     * Indicate that this entry is a symbolic link to the given filename.\n     *\n     * @param name Name of the file this entry links to, empty String\n     *             if it is not a symbolic link.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 20)",
        "(line 196,col 9)-(line 196,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getLinkedFile()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Name of linked file\n     *\n     * @return name of the file this entry links to if it is a\n     *         symbolic link, the empty string otherwise.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.isLink()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Is this entry a symbolic link?\n     * @return true if this is a symbolic link\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setMode(int)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     * File mode of this file.\n     * @param mode the file mode\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getMode()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * File mode of this file.\n     * @return the file mode\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setDirectory(boolean)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\n     * Indicate whether this entry is a directory.\n     * @param dirFlag if true, this entry is a directory\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 31)",
        "(line 239,col 9)-(line 239,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.isDirectory()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Is this entry a directory?\n     * @return true if this entry is a directory\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 257,
      "end_line": 288,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     * @param data an array of bytes\n     * @param offset the start offset\n     * @param length the number of bytes in the array from offset\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 60)",
        "(line 261,col 9)-(line 261,col 45)",
        "(line 262,col 9)-(line 262,col 69)",
        "(line 263,col 9)-(line 263,col 20)",
        "(line 264,col 9)-(line 264,col 24)",
        "(line 265,col 9)-(line 265,col 43)",
        "(line 266,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 273,col 48)",
        "(line 275,col 9)-(line 275,col 68)",
        "(line 276,col 9)-(line 276,col 40)",
        "(line 277,col 9)-(line 277,col 40)",
        "(line 279,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 48)",
        "(line 287,col 9)-(line 287,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 294,
      "end_line": 298,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same data in central directory and local file data.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getMode(int)",
      "begin_line": 305,
      "end_line": 313,
      "comment": "\n     * Get the file mode for given permissions with the correct file type.\n     * @param mode the mode\n     * @return the type with the mode\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 29)",
        "(line 307,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.clone()",
      "begin_line": 315,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 323,col 9)"
      ]
    }
  ]
}