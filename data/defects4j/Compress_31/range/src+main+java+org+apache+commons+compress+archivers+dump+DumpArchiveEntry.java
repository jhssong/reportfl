{
  "filepath": "/tmp/Compress-31b/src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DumpArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 181,
      "end_line": 809,
      "comment": "\n * This class represents an entry in a Dump archive. It consists\n * of the entry\u0027s header, the entry\u0027s File and any extended attributes.\n * \u003cp\u003e\n * DumpEntries that are created from the header bytes read from\n * an archive are instantiated with the DumpArchiveEntry( byte[] )\n * constructor. These entries will be used when extracting from\n * or listing the contents of an archive. These entries have their\n * header filled in using the header bytes. They also set the File\n * to null, since they reference an archive entry not a file.\n * \u003cp\u003e\n * DumpEntries can also be constructed from nothing but a name.\n * This allows the programmer to construct the entry by hand, for\n * instance when only an InputStream is available for writing to\n * the archive, and the header information is constructed from\n * other information. In this case the header fields are set to\n * defaults and the File is set to null.\n *\n * \u003cp\u003e\n * The C structure for a Dump Entry\u0027s header is:\n * \u003cpre\u003e\n * #define TP_BSIZE    1024          // size of each file block\n * #define NTREC       10            // number of blocks to write at once\n * #define HIGHDENSITYTREC 32        // number of blocks to write on high-density tapes\n * #define TP_NINDIR   (TP_BSIZE/2)  // number if indirect inodes in record\n * #define TP_NINOS    (TP_NINDIR / sizeof (int32_t))\n * #define LBLSIZE     16\n * #define NAMELEN     64\n *\n * #define OFS_MAGIC     (int)60011  // old format magic value\n * #define NFS_MAGIC     (int)60012  // new format magic value\n * #define FS_UFS2_MAGIC (int)0x19540119\n * #define CHECKSUM      (int)84446  // constant used in checksum algorithm\n *\n * struct  s_spcl {\n *   int32_t c_type;             // record type (see below)\n *   int32_t \u003cb\u003ec_date\u003c/b\u003e;             // date of this dump\n *   int32_t \u003cb\u003ec_ddate\u003c/b\u003e;            // date of previous dump\n *   int32_t c_volume;           // dump volume number\n *   u_int32_t c_tapea;          // logical block of this record\n *   dump_ino_t c_ino;           // number of inode\n *   int32_t \u003cb\u003ec_magic\u003c/b\u003e;            // magic number (see above)\n *   int32_t c_checksum;         // record checksum\n * #ifdef  __linux__\n *   struct  new_bsd_inode c_dinode;\n * #else\n * #ifdef sunos\n *   struct  new_bsd_inode c_dinode;\n * #else\n *   struct  dinode  c_dinode;   // ownership and mode of inode\n * #endif\n * #endif\n *   int32_t c_count;            // number of valid c_addr entries\n *   union u_data c_data;        // see above\n *   char    \u003cb\u003ec_label[LBLSIZE]\u003c/b\u003e;   // dump label\n *   int32_t \u003cb\u003ec_level\u003c/b\u003e;            // level of this dump\n *   char    \u003cb\u003ec_filesys[NAMELEN]\u003c/b\u003e; // name of dumpped file system\n *   char    \u003cb\u003ec_dev[NAMELEN]\u003c/b\u003e;     // name of dumpped device\n *   char    \u003cb\u003ec_host[NAMELEN]\u003c/b\u003e;    // name of dumpped host\n *   int32_t c_flags;            // additional information (see below)\n *   int32_t c_firstrec;         // first record on volume\n *   int32_t c_ntrec;            // blocksize on volume\n *   int32_t c_extattributes;    // additional inode info (see below)\n *   int32_t c_spare[30];        // reserved for future uses\n * } s_spcl;\n *\n * //\n * // flag values\n * //\n * #define DR_NEWHEADER     0x0001  // new format tape header\n * #define DR_NEWINODEFMT   0x0002  // new format inodes on tape\n * #define DR_COMPRESSED    0x0080  // dump tape is compressed\n * #define DR_METAONLY      0x0100  // only the metadata of the inode has been dumped\n * #define DR_INODEINFO     0x0002  // [SIC] TS_END header contains c_inos information\n * #define DR_EXTATTRIBUTES 0x8000\n *\n * //\n * // extattributes inode info\n * //\n * #define EXT_REGULAR         0\n * #define EXT_MACOSFNDRINFO   1\n * #define EXT_MACOSRESFORK    2\n * #define EXT_XATTR           3\n *\n * // used for EA on tape\n * #define EXT2_GOOD_OLD_INODE_SIZE    128\n * #define EXT2_XATTR_MAGIC        0xEA020000  // block EA\n * #define EXT2_XATTR_MAGIC2       0xEA020001  // in inode EA\n * \u003c/pre\u003e\n * \u003cp\u003e\n * The fields in \u003cb\u003ebold\u003c/b\u003e are the same for all blocks. (This permitted\n * multiple dumps to be written to a single tape.)\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * The C structure for the inode (file) information is:\n * \u003cpre\u003e\n * struct bsdtimeval {           //  **** alpha-*-linux is deviant\n *   __u32   tv_sec;\n *   __u32   tv_usec;\n * };\n *\n * #define NDADDR      12\n * #define NIADDR       3\n *\n * //\n * // This is the new (4.4) BSD inode structure\n * // copied from the FreeBSD 2.0 \u0026lt;ufs/ufs/dinode.h\u0026gt; include file\n * //\n * struct new_bsd_inode {\n *   __u16       di_mode;           // file type, standard Unix permissions\n *   __s16       di_nlink;          // number of hard links to file.\n *   union {\n *      __u16       oldids[2];\n *      __u32       inumber;\n *   }           di_u;\n *   u_quad_t    di_size;           // file size\n *   struct bsdtimeval   di_atime;  // time file was last accessed\n *   struct bsdtimeval   di_mtime;  // time file was last modified\n *   struct bsdtimeval   di_ctime;  // time file was created\n *   __u32       di_db[NDADDR];\n *   __u32       di_ib[NIADDR];\n *   __u32       di_flags;          //\n *   __s32       di_blocks;         // number of disk blocks\n *   __s32       di_gen;            // generation number\n *   __u32       di_uid;            // user id (see /etc/passwd)\n *   __u32       di_gid;            // group id (see /etc/group)\n *   __s32       di_spare[2];       // unused\n * };\n * \u003c/pre\u003e\n * \u003cp\u003e\n * It is important to note that the header DOES NOT have the name of the\n * file. It can\u0027t since hard links mean that you may have multiple filenames\n * for a single physical file. You must read the contents of the directory\n * entries to learn the mapping(s) from filename to inode.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * The C structure that indicates if a specific block is a real block\n * that contains data or is a sparse block that is not persisted to the\n * disk is:\u003c/p\u003e\n * \u003cpre\u003e\n * #define TP_BSIZE    1024\n * #define TP_NINDIR   (TP_BSIZE/2)\n *\n * union u_data {\n *   char    s_addrs[TP_NINDIR]; // 1 \u003d\u0026gt; data; 0 \u003d\u0026gt; hole in inode\n *   int32_t s_inos[TP_NINOS];   // table of first inode on each volume\n * } u_data;\n * \u003c/pre\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "permissions"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "atime"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mtime"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uid"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gid"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "summary"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * Currently unused\n     "
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " this information is available from standard index."
    },
    {
      "type": "field",
      "varNames": [
        "simpleName"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "originalName"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "volume"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " this information is available from QFA index"
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ino"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nlink"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ctime"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generation"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isDeleted"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.DumpArchiveEntry()",
      "begin_line": 214,
      "end_line": 215,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.DumpArchiveEntry(java.lang.String, java.lang.String)",
      "begin_line": 222,
      "end_line": 225,
      "comment": "\n     * Constructor taking only filename.\n     * @param name pathname\n     * @param simpleName actual filename.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 22)",
        "(line 224,col 9)-(line 224,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.DumpArchiveEntry(java.lang.String, java.lang.String, int, org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE)",
      "begin_line": 235,
      "end_line": 242,
      "comment": "\n     * Constructor taking name, inode and type.\n     *\n     * @param name\n     * @param simpleName\n     * @param ino\n     * @param type\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 22)",
        "(line 238,col 9)-(line 238,col 22)",
        "(line 239,col 9)-(line 239,col 37)",
        "(line 240,col 9)-(line 240,col 23)",
        "(line 241,col 9)-(line 241,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getSimpleName()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * Returns the path of the entry.\n     * @return the path of the entry.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setSimpleName(java.lang.String)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Sets the path of the entry.\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getIno()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Returns the ino of the entry.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getNlink()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Return the number of hard links to the entry.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setNlink(int)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Set the number of hard links.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getCreationTime()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Get file creation time.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setCreationTime(java.util.Date)",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * Set the file creation time.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getGeneration()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * Return the generation of the file.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setGeneration(int)",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\n     * Set the generation of the file.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isDeleted()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * Has this file been deleted? (On valid on incremental dumps.)\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setDeleted(boolean)",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\n     * Set whether this file has been deleted.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getOffset()",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\n     * Return the offset within the archive\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setOffset(long)",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\n     * Set the offset within the archive.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getVolume()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\n     * Return the tape volume where this file is located.\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setVolume(int)",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n     * Set the tape volume.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getHeaderType()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n     * Return the type of the tape segment header.\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getHeaderCount()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n     * Return the number of records in this segment.\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getHeaderHoles()",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n     * Return the number of sparse records in this segment.\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isSparseRecord(int)",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n     * Is this a sparse record?\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.hashCode()",
      "begin_line": 387,
      "end_line": 390,
      "comment": "\n     * @see java.lang.Object#hashCode()\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.equals(java.lang.Object)",
      "begin_line": 395,
      "end_line": 419,
      "comment": "\n     * @see java.lang.Object#equals(Object o)\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 401,col 9)",
        "(line 403,col 9)-(line 403,col 52)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 418,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.toString()",
      "begin_line": 424,
      "end_line": 427,
      "comment": "\n     * @see java.lang.Object#toString()\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.parse(byte[])",
      "begin_line": 436,
      "end_line": 498,
      "comment": "\n     * Populate the dump archive entry and tape segment header with\n     * the contents of the buffer.\n     *\n     * @param buffer\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 56)",
        "(line 438,col 9)-(line 438,col 48)",
        "(line 440,col 9)-(line 441,col 32)",
        "(line 446,col 9)-(line 446,col 62)",
        "(line 448,col 9)-(line 448,col 71)",
        "(line 452,col 9)-(line 452,col 54)",
        "(line 455,col 9)-(line 455,col 51)",
        "(line 458,col 9)-(line 458,col 25)",
        "(line 460,col 9)-(line 460,col 60)",
        "(line 462,col 9)-(line 462,col 61)",
        "(line 464,col 9)-(line 465,col 59)",
        "(line 466,col 9)-(line 466,col 41)",
        "(line 467,col 9)-(line 468,col 59)",
        "(line 469,col 9)-(line 469,col 47)",
        "(line 470,col 9)-(line 471,col 59)",
        "(line 472,col 9)-(line 472,col 24)",
        "(line 478,col 9)-(line 478,col 66)",
        "(line 479,col 9)-(line 479,col 64)",
        "(line 480,col 9)-(line 480,col 65)",
        "(line 482,col 9)-(line 482,col 62)",
        "(line 484,col 9)-(line 484,col 25)",
        "(line 486,col 9)-(line 490,col 9)",
        "(line 492,col 9)-(line 492,col 60)",
        "(line 494,col 9)-(line 494,col 42)",
        "(line 497,col 9)-(line 497,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.update(byte[])",
      "begin_line": 503,
      "end_line": 516,
      "comment": "\n     * Update entry with information from next tape segment header.\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 62)",
        "(line 505,col 9)-(line 505,col 62)",
        "(line 507,col 9)-(line 507,col 25)",
        "(line 509,col 9)-(line 513,col 9)",
        "(line 515,col 9)-(line 515,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TapeSegmentHeader",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 522,
      "end_line": 557,
      "comment": "\n     * Archive entry as stored on tape. There is one TSH for (at most)\n     * every 512k in the file.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 523,
      "end_line": 523,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "volume"
      ],
      "begin_line": 524,
      "end_line": 524,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ino"
      ],
      "begin_line": 525,
      "end_line": 525,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 526,
      "end_line": 526,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "holes"
      ],
      "begin_line": 527,
      "end_line": 527,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cdata"
      ],
      "begin_line": 528,
      "end_line": 528,
      "comment": " map of any \u0027holes\u0027"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getType()",
      "begin_line": 530,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 531,col 13)-(line 531,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getVolume()",
      "begin_line": 534,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 535,col 13)-(line 535,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getIno()",
      "begin_line": 538,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 539,col 13)-(line 539,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.setIno(int)",
      "begin_line": 542,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 543,col 13)-(line 543,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getCount()",
      "begin_line": 546,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 547,col 13)-(line 547,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getHoles()",
      "begin_line": 550,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 551,col 13)-(line 551,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getCdata(int)",
      "begin_line": 554,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 555,col 13)-(line 555,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getName()",
      "begin_line": 563,
      "end_line": 565,
      "comment": "\n     * Returns the name of the entry.\n     * @return the name of the entry.\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getOriginalName()",
      "begin_line": 571,
      "end_line": 573,
      "comment": "\n     * Returns the unmodified name of the entry.\n     * @return the name of the entry.\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setName(java.lang.String)",
      "begin_line": 578,
      "end_line": 589,
      "comment": "\n     * Sets the name of the entry.\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 33)",
        "(line 580,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 588,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getLastModifiedDate()",
      "begin_line": 591,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isDirectory()",
      "begin_line": 598,
      "end_line": 600,
      "comment": "\n     * Is this a directory?\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isFile()",
      "begin_line": 605,
      "end_line": 607,
      "comment": "\n     * Is this a regular file?\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isSocket()",
      "begin_line": 612,
      "end_line": 614,
      "comment": "\n     * Is this a network device?\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isChrDev()",
      "begin_line": 619,
      "end_line": 621,
      "comment": "\n     * Is this a character device?\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isBlkDev()",
      "begin_line": 626,
      "end_line": 628,
      "comment": "\n     * Is this a block device?\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isFifo()",
      "begin_line": 633,
      "end_line": 635,
      "comment": "\n     * Is this a fifo/pipe?\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getType()",
      "begin_line": 640,
      "end_line": 642,
      "comment": "\n     * Get the type of the entry.\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setType(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE)",
      "begin_line": 647,
      "end_line": 649,
      "comment": "\n     * Set the type of the entry.\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getMode()",
      "begin_line": 654,
      "end_line": 656,
      "comment": "\n     * Return the access permissions on the entry.\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setMode(int)",
      "begin_line": 661,
      "end_line": 664,
      "comment": "\n     * Set the access permissions on the entry.\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 33)",
        "(line 663,col 9)-(line 663,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getPermissions()",
      "begin_line": 669,
      "end_line": 671,
      "comment": "\n     * Returns the permissions on the entry.\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getSize()",
      "begin_line": 676,
      "end_line": 678,
      "comment": "\n     * Returns the size of the entry.\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getEntrySize()",
      "begin_line": 683,
      "end_line": 685,
      "comment": "\n     * Returns the size of the entry as read from the archive.\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setSize(long)",
      "begin_line": 690,
      "end_line": 692,
      "comment": "\n     * Set the size of the entry.\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setLastModifiedDate(java.util.Date)",
      "begin_line": 697,
      "end_line": 699,
      "comment": "\n     * Set the time the file was last modified.\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getAccessTime()",
      "begin_line": 704,
      "end_line": 706,
      "comment": "\n     * Returns the time the file was last accessed.\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setAccessTime(java.util.Date)",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\n     * Set the time the file was last accessed.\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getUserId()",
      "begin_line": 718,
      "end_line": 720,
      "comment": "\n     * Return the user id.\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setUserId(int)",
      "begin_line": 725,
      "end_line": 727,
      "comment": "\n     * Set the user id.\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getGroupId()",
      "begin_line": 732,
      "end_line": 734,
      "comment": "\n     * Return the group id\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setGroupId(int)",
      "begin_line": 739,
      "end_line": 741,
      "comment": "\n     * Set the group id.\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 754,
      "end_line": 754,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.TYPE(int)",
      "begin_line": 756,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 757,col 13)-(line 757,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.find(int)",
      "begin_line": 760,
      "end_line": 770,
      "comment": "",
      "child_ranges": [
        "(line 761,col 13)-(line 761,col 32)",
        "(line 763,col 13)-(line 767,col 13)",
        "(line 769,col 13)-(line 769,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 787,
      "end_line": 787,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.PERMISSION(int)",
      "begin_line": 789,
      "end_line": 791,
      "comment": "",
      "child_ranges": [
        "(line 790,col 13)-(line 790,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find(int)",
      "begin_line": 793,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 794,col 13)-(line 794,col 60)",
        "(line 796,col 13)-(line 800,col 13)",
        "(line 802,col 13)-(line 804,col 13)",
        "(line 806,col 13)-(line 806,col 39)"
      ]
    }
  ]
}