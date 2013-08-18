/*
 * File: app/store/AuthUsers.js
 *
 * This file was generated by Sencha Architect version 2.2.2.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.2.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.2.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('Simpleauth.store.AuthUsers', {
    extend: 'Ext.data.Store',

    requires: [
        'Simpleauth.model.AuthUser'
    ],

    constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({
            autoLoad: true,
            model: 'Simpleauth.model.AuthUser',
            remoteFilter: true,
            storeId: 'AuthUsers',
            proxy: {
                type: 'direct',
                directFn: authWeb.loadAuthUsers,
                reader: {
                    type: 'json',
                    root: 'records'
                }
            },
            listeners: {
                load: {
                    fn: me.fitin,
                    scope: me
                }
            },
            sorters: {
                property: 'username'
            }
        }, cfg)]);
    },

    fitin: function(store, records, successful, eOpts) {
        if (store.currentPage > 1 && !records.length) {
            store.previousPage();
        }   
    }

});