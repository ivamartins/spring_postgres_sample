-- noinspection SqlNoDataSourceInspectionForFile
-- Table: provider
-- DROP TABLE provider;
CREATE TABLE IF NOT EXISTS provider
(
    id             serial            NOT NULL,
    razao_social   varchar           NOT NULL,
    nome_fantasia  varchar           NOT NULL,
    CONSTRAINT provider_pkey PRIMARY KEY (id)
);